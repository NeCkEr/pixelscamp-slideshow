(ns slides.effects
  (:require [goog.events :as gevents]
            [goog.events.EventType :as EventType]
            [goog.events.KeyCodes :as KeyCodes]
            [cljs.core.async :as a]))

(defn listen-arrow-keys!
  [<slides-events]
  (println "listen-arrow-keys!")
  (gevents/listen js/document
    EventType/KEYUP
    (fn [e]
      (when (or
              (= (.-keyCode e) KeyCodes/DOWN)
              (= (.-keyCode e) KeyCodes/RIGHT))
        (println "<slides-events :next-slide")
        (a/put! <slides-events :next-slide))
      (when (or
              (= (.-keyCode e) KeyCodes/UP)
              (= (.-keyCode e) KeyCodes/LEFT))
        (println "<slides-events :previous-slide")
        (a/put! <slides-events :previous-slide))
      nil)))