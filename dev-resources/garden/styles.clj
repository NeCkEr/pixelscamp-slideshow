(ns styles
  (:require [garden.def :refer [defstyles defrule]]
            [garden.units :refer [percent px rem vh vw em]]
            [garden.color :as color :refer [hsl rgb rgba]]
            [garden.stylesheet :as s]
            [utils :as u]))



(def elektra-light
  (s/at-font-face {:font-family "elektra_light_proregular"
                   :src         "url('/fonts/elektralight-webfont.woff2') format('woff2'),
                                 url('/fonts/elektralight-webfont.woff') format('woff')"
                   :font-weight "normal"
                   :font-style  "normal"}))


(def elektra-bold
  (s/at-font-face {:font-family "elektra_text_probold"
                   :src         "url('/fonts/elektratextbold-webfont.woff2') format('woff2'),
                                 url('/fonts/elektratextbold-webfont.woff') format('woff')"
                   :font-weight "normal"
                   :font-style  "normal"}))


;; Colors

(def $background-color "#303030") ;; Mine Shaft
(def $content-color "#ffffff") ;; White

(defstyles all
  elektra-light
  elektra-bold

  [:* :*:after :*:before
   ^:prefix {:box-sizing "border-box"}]

  [:html
   {:font-size (percent 62.5)}]

  [:body
   {:font             {:size   (rem 1.6)
                       :family "elektra_light_proregular"}
    :color            $content-color
    :background-color $background-color}]

  [:a
   {:text-decoration "none"}]

  [:li {:list-style-type "none"}]


  [:.cd-slideshow-wrapper
   {:overflow "hidden"}]


  [:.cd-slideshow
   {:position "relative"}
   [:.sub-slides
    {:width (percent 100)}]
   (u/clearfix :.sub-slides)

   [:li
    {:position "relative"
     :z-index  1
     :height   (vh 100)
     :width    (vw 100)}]
   (u/clearfix :li)]


  [:.cd-slider-content
   {:position "relative"
    :height   (vh 100)
    :width    (percent 100)
    :float    "left"
    :display  "table"}
   [:.content-wrapper
    {:display        "table-cell"
     :vertical-align "middle"}]
   [:h2 :h1
    {:font-size "10rem"
     :color     $content-color}]
   [:h3
    {:font-size   "10rem"
     :color       $content-color
     :font-family "elektra_text_probold"}]
   [:h4
    {:font-size   "8rem"
     :color       $content-color}]
   [:p
    {:margin-top    (em 1)
     :margin-right  0
     :margin-bottom (em 2)
     :margin-left   0
     :opacity       0.6}]])