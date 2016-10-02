(ns slides.views.slider
  (:require [reagent.core :as r]))

(defn time-line-year
  [{:keys [!db] :as ctx} year]
  (fn
    []
    (println (:current-year @!db))
    [:div.out-line {:style {:display        "table"
                            :vertical-align "middle"}}
     (cond
       (or (= year 1940) (= year 2016) (= (:current-year @!db) year))
       [:div.line {:style {:background-color "gray"
                           :width            "50px"
                           :height           "2px"
                           :margin-top       "10px"
                           :margin-bottom    "10px"
                           :float            "left"}}]

       (and (> year 1940) (< year 2000))
       [:div.line {:style {:background-color "gray"
                           :width            "15px"
                           :height           "1px"
                           :margin-top       "2.5px"
                           :margin-bottom    "2.5px"
                           :float            "left"}}]

       :else
       [:div.line {:style {:background-color "gray"
                           :width            "30px"
                           :height           "2px"
                           :margin-top       "10px"
                           :margin-bottom    "10px"
                           :float            "left"}}
        ])

     (cond
       (or (= year 1940) (= year 2016) (= (:current-year @!db) year))
       [:div.year {:style {:float       "left"
                           :margin-left "10px"}} year])]))

(defn main
  [{:keys [!db slides] :as ctx}]
  (let [time-line-years (reverse (take (- 2016 1939) (filter (fn [n] (> n 1939)) (range))))]
    (r/create-class
      {:component-did-mount
       (fn [])
       :reagent-render
       (fn [{:keys [!db slides]}]
         (let [current-slide  (nth slides (:current-slide @!db))
               show-timeline? (:show-timeline? current-slide)]
           [:div (when show-timeline?
                   [:div.time-line {:style {:position "fixed"}}
                    (doall
                      (for [year time-line-years]
                        ^{:key year}
                        [time-line-year ctx year]))])
            [:ol.cd-slideshow {:style {:transform (str "translateY(" (:current-translateY @!db) "px)")}}]
            [(-> slides (nth (:current-slide @!db)) :content-view) !db]]))})))
