(ns slides.core
  (:require [reagent.core :as r]
            [slides.views.main :as main-view]
            [slides.events :as events]))

(enable-console-print!)

(defn mount-root []
  (r/render [main-view/page]
    (.getElementById js/document "app")))

(defn ^:export init []
  (events/listen-arrow-keys!)
  (mount-root))


