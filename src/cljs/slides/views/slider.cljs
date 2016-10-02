(ns slides.views.slider
  (:require [reagent.core :as r]))


(defn main
  [{:keys [!db slides]}]
  (println (-> @!db :slides first :content-view))
  (r/create-class
    {:component-did-mount
     (fn [])
     :reagent-render
     (fn [{:keys [!db slides]}]
       (println (:current-slide @!db))
       [:ol.cd-slideshow {:style {:transform (str "translateY(" (:current-translateY @!db) "px)")}}]
       [(-> slides (nth (:current-slide @!db)) :content-view) !db]
       )}))
