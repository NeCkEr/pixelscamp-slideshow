(ns slides.views.content)

;;
;; REPL helpers aka to show off :)
;;

(defonce controller! nil)

(defn next! []
  (let [{:keys [event-handler render-ctx]} controller!]
    (event-handler render-ctx [:slider :next-slide])))

(defn prev! []
  (let [{:keys [event-handler render-ctx]} controller!]
    (event-handler render-ctx [:slider :previous-slide])))

;;
;;
;; Slides \o/
;;
;;
(comment

(next!)
(prev!)

  )

(defn slide-1
  "Welcome?  obrigado por terem vindo //portuguese joke :)
  -
  I want to tell you something..."
  [!db]
  [:li#slide-1
   [:div.cd-slider-content {:style {:margin-left "130px"}}
    [:div.content-wrapper
     [:h1 "_"]
     [:h2 "One of the"]
     [:h2 "best kept scretes"]
     [:h2 "on web development"]]]])















(comment

(next!)
  (prev!)

  )

(defn slide-2
  "This reflects a lot of my learnings throught the last 15 years
  -happy to discuss it over dinner
  -fell free to correct me
  -maybe alot of biased facts for sure..."
  [!db]
  [:li#slide-1
   [:div.cd-slider-content {:style {:margin-left "130px"}}
    [:div.content-wrapper
     [:h1 "_"]
     [:h2 "But first..."]
     [:h3 "A litle bit of history :)"]]]])














(comment
  ;; YEAR - 1940
(next!)
  (prev!)

  )

(defn slide-3
  "Lets go back to 1940"
  [!db]
  [:li#slide-1
   [:div.cd-slider-content {:style {:margin-left "130px"}}
    [:div.content-wrapper
     [:h3 "Programming languages"]]]])

;;animate history of first languagens ada and stuff
;;20 years of stuff
















(comment
  ;; YEAR - 1960
(next!)
  (prev!)

  )

(defn slide-4
  ""
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

;; mention ALGOL
;; C basic visual-basic c# java
;; check this bits of the history...
;; perl phyton
;; 40 years or more











(comment

(next!)
  (prev!)

  )

(defn slide-5
  [!db]
  [:li#slide-1
   [:div.cd-slider-content {:style {:margin-left "130px"}}
    [:div.content-wrapper
     [:h3 "Internet"]
     [:h3 "World Wide Web"]]]])

;;
;; add dot.com buble! puck yeah!
;; (os anos das vacas gordas!)
;;
;;
























(comment

(next!)
  (prev!)

  )

(defn slide-6
  "It was when we invented this new Web development thing"
  [!db]
  [:li#slide-1
   [:div.cd-slider-content {:style {:margin-left "130px"}}
    [:div.content-wrapper
     [:h3 "Web development"]
     [:h4 "Commercialization of the web"]]]])



















(comment

(next!)
  (prev!)

  )

(defn slide-7
  "And this...
  When was the last time u did this?"
  [!db]
  [:li#slide-1
   [:div.cd-slider-content {:style {:margin-left "130px"}}
    [:div.content-wrapper
     [:img {:src "/images/browser-server.png"}]
     [:h4 "When was the last"]
     [:h4 "time you did on of this?"]]]])
















(comment

(next!)
  (prev!)

  )

(defn slide-8
  "ARCHITECTURE diagrams
  The monster started to grow and grow and grow " ;;check reference !!
  [!db]
  [:li#slide-1
   [:div.cd-slider-content {:style {:margin-left "130px"}}
    [:div.content-wrapper
     [:img {:src "/images/browser-server.png"}]
     [:h4 "Ohhh"]
     [:h4 "Shiit!?"]]]])




















(comment

(next!)
  (prev!)

  )


(defn slide-9
  "The secret is revealed
  if you only take away one thing from this talk this is the one"
  [!db]
  [:li#slide-1
   [:div.cd-slider-content {:style {:margin-left "130px"}}
    [:div.content-wrapper
     [:h2 "_"]
     [:h3 "The Secret"]
     [:h2 "Web Development is"]
     [:h2 "Distributed Systems Programming"]]]])

























(comment

(next!)
  (prev!)

  )

(defn slide-10
  "Then this happened in my developer career I
  came for the first time to codebits"
  [!db]
  [:li#slide-1
   [:div.cd-slider-content {:style {:margin-left "130px"}}
    [:div.content-wrapper
     [:h3 "Codebits 2008"]]]])


















(comment

(next!)
  (prev!)

  )


(defn slide-11
  "Yeah comming to this first nerd thing sitting at this guys table
  and hearing about this new javascript thing that was going to ramp up
  -How crazy you need to be"
  [!db]
  [:li#slide-1
   [:div.cd-slider-content {:style {:margin-left "130px"}}
    [:div.content-wrapper
     [:h3 "Codebits 2008"]
     [:h4 "Mario Valente"]
     [:h2 "Serverside Javascript"]
     [:h2 "hope and opportunity"]
     [:h4 "gif..."]]]])
























(comment

(next!)
  (prev!)

  )

(defn slide-12
  "but sorts out he was right
  - Javascript race for speed"
  [!db]
  [:li#slide-1
   [:div.cd-slider-content {:style {:margin-left "130px"}}
    [:div.content-wrapper
     [:h3 "Hope in Javascript"]
     [:h2 "- js vms racing"]]]])




















(comment

(next!)
  (prev!)

  )

(defn slide-13
  [!db]
  [:li#slide-1
   [:div.cd-slider-content {:style {:margin-left "130px"}}
    [:div.content-wrapper
     [:h3 "Hope in Javascript"]
     [:h2 "Javascript"]
     [:h2 "starts to eat"]
     [:h2 "the world!"]]]])





















(comment

(next!)
  (prev!)

  )

(defn slide-14
  [!db]
  [:li#slide-1
   [:div.cd-slider-content {:style {:margin-left "130px"}}
    [:div.content-wrapper
     [:h3 "Hope in Javascript"]
     [:h2 "- nodejs"]
     [:h2 "- npm"]
     [:h2 "- ES6"]]]])




;; Slide do
;; require('lx')























(comment

(next!)
  (prev!)

  )

(defn slide-15
  "Continueing to having hope...
  Continueing to having hope..."
  [!db]
  [:li#slide-1
   [:div.cd-slider-content {:style {:margin-left "130px"}}
    [:div.content-wrapper
     [:h3 "Hope in Javascript"]
     [:h2 "- first functional language to get into the masses"]
     [:h2 "- async i/o by default"]
     [:h2 "- everything _compiles_  to javascript"]]]])





















(comment

(next!)
  (prev!)

  )

(defn slide-16
  "Continueing to having hope...
  Are we there yet? "
  [!db]
  [:li#slide-1
   [:div.cd-slider-content {:style {:margin-left "130px"}}
    [:div.content-wrapper
     [:h3 "Are we"]
     [:h3 "there yet?"]]]])


















(defn slide-17
  ""
  [!db]
  [:li#slide-1
   [:div.cd-slider-content
    [:div.content-wrapper
     [:img {:src   "/images/state.jpeg"
            :style {:position "absolute"
                    :top      0
                    :zoom 1.5
                    :left "50%"
                    :margin-left "-250px"}}]]]])


(defn slide-18
  ""
  [!db]
  [:li#slide-1
   [:div.cd-slider-content {:style {:margin-left "130px"}}
    [:div.content-wrapper
     [:img {:src   "/images/shark_clojure.png"
            :style {:position "absolute"
                    :top      0
                    :right    350
                    :width    "450px"
                    :height   "450px"}}]]]])


;; revenge


;;clojure shark

;;clojurescript rhino




;What makes it special?
;
;LISP!
;Functional Programming
;Dynamic Development REPL
;Immutable data-structures
;Lazy
;Communicating Sequential Processes (CSP) Ala Go-Lang



;;SHow me some code!


;;_
;;But before tooling
;;emacs

;;REPL!!
(comment
  ;;primitives:

  10

  33.3

  1/3 ;;fraction or ratio


  false, true

  nil

  \a

  "beep boop")


;;data-structures
(comment

  ;; Lists (the classic LISP data-structures new items added at the front)
  (1 2 3)
  ;;^^^^ they are also used to reprensent clojure code
  (println "hello" "world")

  ;; Vectors (new values added at the end)
  [1 2 3]

  ;;Maps
  {:first-name "Bruno"
   :last-name  "Barreto"}

  ;;sets
  #{"zzz" "weee" "brrr"})

;;functions

(comment

  (defn average [& nums]
    (/ (reduce + nums)
      (count nums)))

  (average 4 11)

  (average 3.0 72 9.8 33)

  ;; Sum the first 100 even numbers
  (reduce + (take 100 (filter even? (range))))
  )

;;mix all data structures


;;show slides example


;;CSP




;;;

;;; Tooling



