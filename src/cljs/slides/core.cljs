(ns slides.core
  (:require [reagent.core :as r]
            [slides.views.slider :as slider]
            [slides.effects :as effects]
            [cljs.core.async :as a]
            [taoensso.timbre :as log])
  (:require-macros [cljs.core.async.macros :refer [go-loop]]))

(defonce system nil)
(defonce config nil)

(defn start-event-loop!
  [<ui-events <slides-events event-handler render-ctx]
  (go-loop
    []
    (let [[v chan] (a/alts! [<ui-events <slides-events] :priority true)]
      (when v
        (println v)
        (try
          (condp = chan
            <ui-events (event-handler render-ctx v)
            <slides-events (event-handler render-ctx [:slider v]))
          (catch :default e
            (log/error e (str "Error while processing event: " (pr-str v)))))
        (recur)))))

(defn system->render-ctx!
  [system]
  (dissoc system :<slides-events :<ui-events :handler-fn))

(defn mount-root! [ctx]
  (r/render [slider/main ctx]
    (.getElementById js/document "app")))

(defn ^:export init []
  (let [{:keys [<ui-events <slides-events handler-fn]} system]
    (effects/listen-arrow-keys! <slides-events)
    (start-event-loop! <ui-events <slides-events handler-fn (system->render-ctx! system)))
  (mount-root! (system->render-ctx! system)))