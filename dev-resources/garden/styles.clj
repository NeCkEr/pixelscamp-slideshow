(ns styles
  (:require [garden.def :refer [defstyles defrule]]
            [garden.units :refer [percent px rem vh vw]]
            [garden.color :as color :refer [hsl rgb rgba]]
            [garden.stylesheet :as s]
            [utils :as u]))



(def elektra-light
  (s/at-font-face {:font-family "elektra_light_proregular"
                   :src         "url('elektralight-webfont.woff2') format('woff2'),
                                 url('elektralight-webfont.woff') format('woff')"
                   :font-weight "normal"
                   :font-style  "normal"}))


(def elektra-bold
  (s/at-font-face {:font-family "elektra_text_probold"
                   :src         "url('elektratextbold-webfont.woff2') format('woff2'),
                                 url('elektratextbold-webfont.woff') format('woff')"
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
                       :family "Roboto, sans-serif"}
    :color            $background-color
    :background-color $content-color}]

  [:a
   {:text-decoration "none"}]


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


  [:.cd-slider-content])