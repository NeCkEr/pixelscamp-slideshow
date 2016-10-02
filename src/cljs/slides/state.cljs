(ns slides.state
  (:require [reagent.core :as r]
            [slides.views.content :as content]))

(defonce !db (r/atom {:current-slide      0
                      :current-year       1960
                      :current-translateY 0
                      :timeline-visible?  false}))

(def slides [{:content-view   #'content/slide-1
              :show-timeline? false}
             {:content-view   #'content/slide-2
              :show-timeline? false}
             {:content-view   #'content/slide-3
              :show-timeline? true}
             {:content-view   #'content/slide-4
              :show-timeline? true
              :year           1960}
             {:content-view   #'content/slide-5
              :show-timeline? true
              :year           2000}
             {:content-view   #'content/slide-6
              :show-timeline? true
              :year           2004}
             {:content-view   #'content/slide-7
              :show-timeline? true
              :year           2006}])
