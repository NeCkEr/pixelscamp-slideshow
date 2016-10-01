(ns slides.views.content)

(defn slide-1
  [!db]
  [:li#slide-1 {:class-name (when (= (:current-slide @!db) 1)
                              "visible")}
   [:div.cd-slider-content
    [:div.content-wrapper
     [:h2 "slide-1s"]]]])


(defn slide-2
  [!db]
  [:li#slide-1 {:class-name (when (= (:current-slide @!db) 1)
                              "visible")}
   [:div.cd-slider-content
    [:div.content-wrapper
     [:h2 "slide-2"]]]])


(defn slide-3
  [!db]
  [:li#slide-1 {:class-name (when (= (:current-slide @!db) 1)
                              "visible")}
   [:div.cd-slider-content
    [:div.content-wrapper
     [:h2 "slide-3"]]]])



(defn slide-4
  [!db]
  [:li#slide-1 {:class-name (when (= (:current-slide @!db) 1)
                              "visible")}
   [:div.cd-slider-content
    [:div.content-wrapper
     [:h2 "slide-4"]]]])