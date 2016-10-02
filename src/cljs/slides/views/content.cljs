(ns slides.views.content)

(defn slide-1
  [!db]
  [:li#slide-1
   [:div.cd-slider-content {:style {:margin-left "130px"}}
    [:div.content-wrapper
     [:h1 "_"]
     [:h2 "One of the"]
     [:h2 "best kept scretes"]
     [:h2 "on web development"]]]])


(defn slide-2
  [!db]
  [:li#slide-1
   [:div.cd-slider-content {:style {:margin-left "130px"}}
    [:div.content-wrapper
     [:h1 "_"]
     [:h2 "But first..."]
     [:h3 "A litle bit of history :)"]]]])


(defn slide-3
  [!db]
  [:li#slide-1
   [:div.cd-slider-content {:style {:margin-left "130px"}}
    [:div.content-wrapper
     [:h3 "Programming languages"]]]])



(defn slide-4
  [!db]
  [:li#slide-1
   [:div.cd-slider-content {:style {:margin-left "130px"}}
    [:div.content-wrapper
     [:img {:src   "/images/john_mccarthy.png"
            :style {:position "absolute"
                    :top      0
                    :right    350
                    :width    "450px"
                    :height   "450px"}}]
     [:div {:style {:float    "left"
                    :position "relative"}}
      [:h3 "LISP"]
      [:h4 "- AI"]
      [:h4 "- GC"]
      [:h4 "- Functional Programming"]]]]])

(defn slide-5
  [!db]
  [:li#slide-1
   [:div.cd-slider-content {:style {:margin-left "130px"}}
    [:div.content-wrapper
     [:h3 "Internet"]
     [:h3 "World Wide Web"]]]])

(defn slide-6
  [!db]
  [:li#slide-1
   [:div.cd-slider-content {:style {:margin-left "130px"}}
    [:div.content-wrapper
     [:h3 "Web development"]
     [:h4 "Commercialization of the web"]]]])

(defn slide-7
  [!db]
  [:li#slide-1 {:class-name (when (= (:current-slide @!db) 1)
                              "visible")}
   [:div.cd-slider-content
    [:div.content-wrapper
     [:h2 "slide-7"]]]])

(defn slide-8
  [!db]
  [:li#slide-1 {:class-name (when (= (:current-slide @!db) 1)
                              "visible")}
   [:div.cd-slider-content
    [:div.content-wrapper
     [:h2 "slide-8"]]]])

(defn slide-9
  [!db]
  [:li#slide-1 {:class-name (when (= (:current-slide @!db) 1)
                              "visible")}
   [:div.cd-slider-content
    [:div.content-wrapper
     [:h2 "slide-9"]]]])