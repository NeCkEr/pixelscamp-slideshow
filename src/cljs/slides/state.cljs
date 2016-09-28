(ns slides.state
  (:require [reagent.core :as r]
            [slides.views.content :as content]))

(defonce !db (r/atom {:current-slide      1
                  :current-translateY 0
                  :timeline-visible?  false
                  :slides             [{:content-view #'content/slide-1}
                                       {:content-view #'content/slide-2}
                                       {:content-view #'content/slide-3}
                                       {:content-view #'content/slide-4
                                        :year         1960}]}))
