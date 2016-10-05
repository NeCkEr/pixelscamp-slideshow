(ns slides.events
  (:require [taoensso.timbre :as log]
            [slides.api :as api]
            [cljs.core.async :as a])
  (:require-macros [cljs.core.async.macros :refer [go-loop]]))

(defmulti process! (fn [_ [id & _]] id))

(defn handle-event! [ctx [id & payload :as event]]
  (when (and (not= :push id) (not= :navigate))
    (log/debugf "[EVENT] %s - %s" id payload))
  (try
    (process! ctx event)
    (catch :default e
      (log/errorf e "Error processing event %s" id))))

(defmethod process! :default
  [_ [id & _]]
  (log/warnf "Unknown event: %s" id))

#_(defmethod process! :slider
    [{:keys [!db slides] :as ctx} [_ direction]]
    (let [next-year    (:year (nth slides (inc (:current-slide @!db))))
          current-year (:current-year @!db)
          delta        (- next-year current-year)
          op           (if (neg? delta) - +)]

      (go-loop [n (js/Math.abs delta)]
        (if (pos? n)
          (do (swap! !db update :current-year op 1)
              (a/<! (a/timeout 50))
              (recur (dec n)))
          (swap! !db (partial api/next-slide! next-year))))))


(defmethod process! :slider
  [{:keys [!db slides] :as ctx} [_ direction]]
  (let [next-year (:year (nth slides (inc (:current-slide @!db))))]
        (if (= :next-slide direction)
          (do
            (let [next-year (:year (nth slides (inc (:current-slide @!db))))]
              (swap! !db (partial api/next-slide! next-year))))
          (reset! !db (api/previous-slide! @!db)))))
