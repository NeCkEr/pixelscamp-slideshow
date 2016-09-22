(ns slides.core
  (:require [reagent.core :as reagent]
            [slides.views.main :as main-view]))

(defn mount-root []
  (reagent/render [main-view/page]
    (.getElementById js/document "app")))

(defn ^:export init []
  (mount-root))


