(ns slides.events
  (:require [taoensso.timbre :as log]))

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

(defmethod process! :slider
  [{:keys [!db] :as ctx} [_ direction]]
  (println "direction: " direction)
  )