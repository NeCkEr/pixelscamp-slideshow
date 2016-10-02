(ns ^:figwheel-no-load slides.build
  [:require [slides.core :as core]
            [slides.state :as state]
            [slides.api :as api]
            [slides.events :as events]
            [taoensso.timbre :as log]
            [cljs.core.async :as a]])

(enable-console-print!)
(log/set-level! :debug)

(defonce <slides-events (a/chan))
(defonce <ui-events (a/chan))

(defn slideshow->system!
  []
  (let [!db        state/!db
        slides     state/slides
        handler-fn #'events/handle-event!
        wrap-emit  (fn [f]
                     (fn [event]
                       (try
                         (f event)
                         (catch :default e
                           (log/error e "Error emitting event"))
                         (finally
                           nil))))]
    {:!db            !db
     :slides         slides
     :emit!          (wrap-emit #(a/put! <ui-events %))
     :emit!!         (wrap-emit handler-fn)
     :handler-fn     handler-fn
     :<slides-events <slides-events
     :<ui-events     <ui-events}))


(set! core/system (slideshow->system!))
(set! api/!history (atom {:history-index 0
                          :history       [@state/!db]}))
(core/init)


(defn reload
  "The figwheel reload callback"
  [& _]
  (log/debug "mount-root!...")
  (core/mount-root! (core/system->render-ctx! (slideshow->system!))))

(defn css-reload
  [& _]
  (log/debug "Reloading CSS..."))



