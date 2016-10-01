(ns slides.views.slider
  (:require [reagent.core :as r]))


(defn main
  [{:keys [!db]}]
  (println (-> @!db :slides first :content-view))
  (r/create-class
    {:component-did-mount
     (fn [])
     :reagent-render
     (fn []
       [:ol.cd-slideshow {:style {:transform (str "translateY(" (:current-translateY @!db) "px)")}}]
       [(-> @!db :slides (nth (:current-slide @!db)) :content-view) !db]
       )}))
