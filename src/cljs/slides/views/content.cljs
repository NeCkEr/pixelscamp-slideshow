(ns slides.views.content)

(defn slide-1
  [!db]
  [:li#slide-1 {:class-name (when (= (:current-slide @!db) 1)
                              "visible")}
   [:div.cd-slider-content
    [:div.content-wrapper
     [:h2 "A SIMPLEs but not EASY introdution to\n\nClojure and ClojureScript"]]]])


(defn slide-2
  [!db]
  [:li#slide-1 {:class-name (when (= (:current-slide @!db) 1)
                              "visible")}
   [:div.cd-slider-content
    [:div.content-wrapper
     [:h2 "A SIMPLE but not EASY introdution to\n\nClojure and ClojureScript"]]]])


(defn slide-3
  [!db]
  [:li#slide-1 {:class-name (when (= (:current-slide @!db) 1)
                              "visible")}
   [:div.cd-slider-content
    [:div.content-wrapper
     [:h2 "A SIMPLE but not EASY introdution to\n\nClojure and ClojureScript"]]]])



(defn slide-4
  [!db]
  [:li#slide-1 {:class-name (when (= (:current-slide @!db) 1)
                              "visible")}
   [:div.cd-slider-content
    [:div.content-wrapper
     [:h2 "A SIMPLE but not EASY introdution to\n\nClojure and ClojureScript"]]]])