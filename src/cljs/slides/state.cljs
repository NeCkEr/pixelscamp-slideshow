(ns slides.state
  (:require [reagent.core :as r]))

(def !db (r/atom {:current-slide      1
                  :current-translateY 0}))
