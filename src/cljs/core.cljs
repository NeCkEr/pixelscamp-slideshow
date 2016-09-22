 (ns core
   (:require [reagent.core :as reagent]
             [views.main :as main-view]))

(defn mount-root []
  (reagent/render [main-view/page]
    (.getElementById js/document "app")))

(defn ^:export init []
  (mount-root))


