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
              :show-timeline? true
              :year           1940}
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
              :year           2006}
             {:content-view   #'content/slide-8
              :show-timeline? true
              :year           2007}
             {:content-view   #'content/slide-8-half
              :show-timeline? true
              :year           2007}
             {:content-view   #'content/slide-8-allmost-nine
              :show-timeline? true
              :year           2007}
             {:content-view   #'content/slide-9
              :show-timeline? true
              :year           2008}
             {:content-view   #'content/slide-10
              :show-timeline? true
              :year           2008}
             {:content-view   #'content/slide-11
              :show-timeline? true
              :year           2008}
             {:content-view   #'content/slide-12
              :show-timeline? true
              :year           2010}
             {:content-view   #'content/slide-13
              :show-timeline? true
              :year           2013}
             {:content-view   #'content/slide-14
              :show-timeline? true
              :year           2013}
             {:content-view   #'content/slide-14-and-half
              :show-timeline? true
              :year           2013}
             {:content-view   #'content/slide-15
              :show-timeline? true
              :year           2015}
             {:content-view   #'content/slide-16
              :show-timeline? true
              :year           2016}
             {:content-view   #'content/slide-17
              :show-timeline? false}
             {:content-view   #'content/slide-18
              :show-timeline? false}
             {:content-view   #'content/slide-19
              :show-timeline? false}
             {:content-view   #'content/slide-20
              :show-timeline? false}
             {:content-view   #'content/slide-21
              :show-timeline? false}
             {:content-view   #'content/slide-22
              :show-timeline? false}
             {:content-view   #'content/slide-23
              :show-timeline? false}
             {:content-view   #'content/slide-24
              :show-timeline? false}
             {:content-view   #'content/slide-25
              :show-timeline? false}
             {:content-view   #'content/slide-26
              :show-timeline? false}
             {:content-view   #'content/slide-27
              :show-timeline? false}
             {:content-view   #'content/slide-28
              :show-timeline? false}
             {:content-view   #'content/slide-29
              :show-timeline? false}])
