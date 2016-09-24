(ns slides.views.main
  (:require [reagent.core :as r]
            [goog.dom :as gdom]
            [goog.style :as gstyle]
            [goog.events :as gevents]
            [goog.events.EventType :as EventType]
            [goog.events.KeyCodes :as KeyCodes]
            [clojure.string :as string]
            [slides.events :as events]
            [cljs.core.async :as a]
            [slides.state :as state])
  (:require-macros [cljs.core.async.macros :refer [go-loop]]))

(defn page
  []
  (r/create-class
    {:component-did-mount
     (fn [this]
       (let [dom-node         (r/dom-node this)
             dom-node-slide2  (gdom/getElement "slide-2")
             dom-node-content (gdom/getFirstElementChild dom-node-slide2)
             slides-width     (.-width (gstyle/getBorderBoxSize dom-node-content))
             slides-offset    (gstyle/getPageOffsetTop dom-node-slide2)
             margin-bottom    (gstyle/getComputedStyle dom-node-content "margin-bottom")]
         (go-loop []
           (let [key-pressed (a/<! events/<slides-events)]
             (if (= key-pressed :next-slide)
               ;; next-slide
               (swap! state/!db (fn [db]
                               (let [new-Y (+ (* -1 slides-offset) (:current-translateY db) (* 3 (int (string/replace margin-bottom "px" ""))))]
                                 (-> db
                                   (assoc :current-translateY new-Y)
                                   (assoc :current-slide (+ 1 (:current-slide db)))))))
               ;; previous-slide
               (swap! state/!db (fn [db]
                               (let [new-Y (+ slides-offset (:current-translateY db) (* 2 (int (string/replace margin-bottom "px" ""))))]
                                 (assoc db :current-translateY new-Y)))))
             (recur)))))
     :reagent-render
     (fn []
       [:ol.cd-slideshow {:style {:transform (str "translateY(" (:current-translateY @state/!db) "px)")}}
        [:li#slide-1 {:class-name (when (= (:current-slide @state/!db) 1)
                                    "visible")}
         [:div.cd-slider-content
          [:div.content-wrapper
           [:h2 "A SIMPLE but not EASY introdution to\n\nClojure and ClojureScript"]]]]
        [:li#slide-2 {:class-name (when (= (:current-slide @state/!db) 2)
                                    "visible")}
         [:div.cd-slider-content
          [:div.content-wrapper
           [:h2 "Clojures"]
           [:img {:src "/images/shark_clojure.jpg"}]]]]
        [:li#slide-3 {:class-name (when (= (:current-slide @state/!db) 3)
                                    "visible")}
         [:div.cd-slider-content
          [:div.content-wrapper
           [:h2 "ClojureScript"]
           [:img {:src    "/images/rino_clojureScript.png"
                  :width  "700px"
                  :height "400px"}]]]]
        [:li#slide-4 {:class-name (when (= (:current-slide @state/!db) 4)
                                    "visible")}
         [:div.cd-slider-content
          [:div.content-wrapper
           [:h2 "Yes is a symbiotic "]
           [:h2 "language (there are other hosts like clojureCLR)"]]]]

        [:li#slide-5 {:class-name (when (= (:current-slide @state/!db) 5)
                                    "visible")}
         [:div.cd-slider-content
          [:div.content-wrapper
           [:h2 "What makes it special?"]]]]

        [:li#slide-6 {:class-name (when (= (:current-slide @state/!db) 6)
                                    "visible")}
         [:div.cd-slider-content
          [:div.content-wrapper
           [:ul
            [:h2 "Functional Programming"]
            [:h2 "Dynamic Development REPL"]
            [:h2 "Immutable data-structures"]
            [:h2 "Lazy"]
            [:h2 "Communicating Sequential Processes (CSP) Ala Go-Lang"]]]]]

        [:li#slide-7 {:class-name (when (= (:current-slide @state/!db) 7)
                                    "visible")}
         [:div.cd-slider-content
          [:div.content-wrapper
           [:h2 "SHow me some code!"]]]]


        [:li#slide-8 {:class-name (when (= (:current-slide @state/!db) 8)
                                    "visible")}
         [:div.cd-slider-content
          [:div.content-wrapper
           [:h2 "Now that everyone is a clojure expert lets jump into clojureScript"]]]]


        [:li#slide-9 {:class-name (when (= (:current-slide @state/!db) 9)
                                    "visible")}
         [:div.cd-slider-content
          [:div.content-wrapper
           [:h2 "First question why javascript?"]]]]


        [:li#slide-10 {:class-name (when (= (:current-slide @state/!db) 10)
                                     "visible")}
         [:div.cd-slider-content
          [:div.content-wrapper
           [:h2 "(beside the fact that all the coolkids are doing that these days :)"]]]]


        [:li#slide-11 {:class-name (when (= (:current-slide @state/!db) 11)
                                     "visible")}
         [:div.cd-slider-content
          [:div.content-wrapper
           [:h2 "REACH!"]
           [:h2 "If you want to go some place javascript is going to take you there :)\n"]]]]


        [:li#slide-12 {:class-name (when (= (:current-slide @state/!db) 12)
                                     "visible")}
         [:div.cd-slider-content
          [:div.content-wrapper
           [:h2 "So what's the problem with javascript?\n"]
           [:h2 "Next time :)"]]]]


        [:li#slide-13 {:class-name (when (= (:current-slide @state/!db) 13)
                                     "visible")}
         [:div.cd-slider-content
          [:div.content-wrapper
           [:h2 "ClojureScript is a compiler"]
           [:img {:src    "/images/cljs_compiler.png"
                  :width  "700px"
                  :height "400px"}]]]]


        [:li#slide-14 {:class-name (when (= (:current-slide @state/!db) 14)
                                     "visible")}
         [:div.cd-slider-content
          [:div.content-wrapper
           [:img {:src    "/images/closure_whitespace.png"
                  :width  "700px"
                  :height "400px"}]]]]


        [:li#slide-15 {:class-name (when (= (:current-slide @state/!db) 15)
                                     "visible")}
         [:div.cd-slider-content
          [:div.content-wrapper
           [:img {:src    "/images/closure_simple.png"
                  :width  "700px"
                  :height "400px"}]]]]


        [:li#slide-16 {:class-name (when (= (:current-slide @state/!db) 16)
                                     "visible")}
         [:div.cd-slider-content
          [:div.content-wrapper
           [:img {:src    "/images/closure_advanced.png"
                  :width  "700px"
                  :height "400px"}]]]]])}))

