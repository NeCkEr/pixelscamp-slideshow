(ns slides.views.slider
  (:require [reagent.core :as r]))

(defn time-line-year
  [{:keys [!db] :as ctx} year]
  (fn
    []
    [:div.out-line {:style {:display        "table"
                            :vertical-align "middle"}}
     (cond
       (= (:current-year @!db) year)
       [:div.layout
        [:svg {:width   "100px"
               :viewBox (str "0 0 150 50")}
         [:polygon {:fill   "#999999"
                    :points "137.95 45.72 0.01 44.52 0.4 0 138.34 1.21 150.35 23.57 137.95 45.72"}]
         [:line {:stroke-width      "2px"
                 :stroke            "#000"
                 :stroke-miterlimit 10
                 :x1                0
                 :x2                70
                 :y1                22
                 :y2                22.30}]
         ]]

       (or (= year 1940) (= year 2016))
       [:div.line {:style {:background-color "#999999"
                           :width            "50px"
                           :height           "2px"
                           :margin-top       "10px"
                           :margin-bottom    "10px"
                           :float            "left"}}]

       (and (> year 1940) (< year 2000))
       [:div.line {:style {:background-color "#999999"
                           :width            "15px"
                           :height           "1px"
                           :margin-top       "2.5px"
                           :margin-bottom    "2.5px"
                           :float            "left"}}]

       :else
       [:div.line {:style {:background-color "#999999"
                           :width            "30px"
                           :height           "2px"
                           :margin-top       "10px"
                           :margin-bottom    "10px"
                           :float            "left"}}
        ])

     (cond
       (and (or (= year 1940) (= year 2016))
         (not= (:current-year @!db) year))
       [:div.year {:style {:color "#999999"
                           :float       "left"
                           :margin-left "10px"}} year]

       (= (:current-year @!db) year)
       [:div.year {:style {:color       "#000"
                           :position    "relative"
                           :margin-left "50px"
                           :margin-top  "-30px"}} year])]))

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

            [(-> slides (nth (:current-slide @!db)) :content-view) !db]]))})))
