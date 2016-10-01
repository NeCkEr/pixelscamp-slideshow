(defproject slide-show-presentation "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.36"]
                 [com.taoensso/timbre "4.4.0"]
                 [reagent "0.6.0-rc"]
                 [garden "1.3.2"]]

  :source-paths ["src"]

  :plugins [[lein-cljsbuild "1.1.4"]
            [lein-figwheel "0.5.7"]
            [lein-garden "0.3.0"]]

  :garden {:builds [{:source-paths ["dev-resources/garden"]
                     :stylesheet styles/all
                     :compiler {:output-to "resources/public/css/styles2.css"
                                ;; Compress the output?
                                :pretty-print? true}}]}

  :clean-targets ^{:protect false} ["resources/public/js/compiled" "target"]

  :figwheel {:css-dirs ["resources/public/css"]}

  :cljsbuild {:builds [{:id           "dev"
                        :source-paths ["src/cljs" "env/cljs"]
                        :figwheel     {:on-jsload  "slides.build/reload"
                                       :on-cssload "slides.build/css-reload"}
                        :compiler     {:main                 slides.build
                                       :output-to            "resources/public/js/compiled/app.js"
                                       :output-dir           "resources/public/js/compiled/out"
                                       :asset-path           "js/compiled/out"
                                       :source-map-timestamp true}}]})
