(ns slides.core
  (:require [reagent.core :as r]
            [slides.views.main :as main-view]
            [slides.views.slider :as slider]
            [slides.effects :as effects]
            [slides.state :as state]))

(enable-console-print!)

(defn mount-root []
  (r/render [slider/main {:!db state/!db}]
    (.getElementById js/document "app")))

(defn ^:export init []
  (effects/listen-arrow-keys!)
  (mount-root))


