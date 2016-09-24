(ns slides.events
  (:require [goog.events :as gevents]
            [goog.events.EventType :as EventType]
            [goog.events.KeyCodes :as KeyCodes]
            [cljs.core.async :as a]))


(def <slides-events (a/chan (a/sliding-buffer 1)))

(defn listen-arrow-keys!
  []
  (gevents/listen js/document
    EventType/KEYUP
    (fn [e]
      (when (or
              (= (.-keyCode e) KeyCodes/DOWN)
              (= (.-keyCode e) KeyCodes/RIGHT))
        (a/put! <slides-events :next-slide))
      (when (or
              (= (.-keyCode e) KeyCodes/UP)
              (= (.-keyCode e) KeyCodes/LEFT))
        (println "next-slide")
        (a/put! <slides-events :previous-slide))
      nil)))