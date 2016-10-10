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
  "Welcome? How we say in portuguese.... obrigado por terem vindo //portuguese joke :)
  -
  I want to tell you something..."
  [!db]
  [:li#slide-1
   [:div.cd-slider-content {:style {:margin-left "130px"}}
    [:div.content-wrapper
     [:h1 "_"]
     [:h2 "One of the"]
     [:h2 "best kept secrets"]
     [:h2 "of web development"]]]])















(comment

(next!)
  (prev!)

  )

(defn slide-2
  "This reflects a lot of my learnings throught the last 15 years
  -happy to discuss it over dinner
  -fell free to correct me
  -maybe alot of biased facts for sure...
  - and I'm pretty sure that dates are wrong in some places"
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
;;Assembly
;;











;;john_mccarthy
;;Programming you are doing it  completely wrong...



(comment
  ;; YEAR - 1960
(next!)
  (prev!)

  )

(defn slide-4
  "What is this?
  - LISt Processing
  - Only Fortran is older
  - for some time was  the AI language
  - inspiered by lambda calculus
  - minimal core"
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
      [:h4 "- Recursion"]
      [:h4 "- Functional Programming"]
      [:h4 "- Data as code"]]]]])













;; mention ALGOL
;; smalltalk
;; C basic visual-basic c# java
;; check this bits of the history...
;; perl phyton ruby
;; 40 years or more

(comment
  ;; YEAR - 2000
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
  ;;YEAR 2004
(next!)
  (prev!)

  )

(defn slide-6
  "It was when we invented this new Web development thing
  everyone needs a website
  or to move their buisness to the digital era"
  [!db]
  [:li#slide-1
   [:div.cd-slider-content {:style {:margin-left "130px"}}
    [:div.content-wrapper
     [:h3 "Web development"]
     [:h4 "Commercialization of the web"]]]])



















(comment
  ;; YEAR 2006
(next!)
  (prev!)

  )

(defn slide-7
  "And this...
  When was the last time u did this?

  This is the typical image that everyone have
  when we speak about webdevelopent

  CLIENT<->SERVER<->DB"
  [!db]
  [:li#slide-1
   [:div.cd-slider-content {:style {:margin-left "130px"}}
    [:div.content-wrapper
     [:img {:src "/images/browser-server.png"}]
     #_[:h4 {:style {:position   "relative"
                     :margin-top "-260px"}} "When was the last"]
     #_[:h4 "time you did on of this?"]]]])
















(comment
  ;;YEAR 2007
(next!)
  (prev!)

  )

(defn slide-8
  "ARCHITECTURE diagrams
  The monster started to grow and grow and grow
  - server all the things
  - MVC
  - View concept render
  - ORMS abstract the database
  - Multiple services
  - more abstractions"
  [!db]
  [:li#slide-1
   [:div.cd-slider-content {:style {:margin-left "130px"}}
    [:div.content-wrapper
     [:img {:src "/images/b-server.png"}]]]])



























(comment
  ;;YEAR 2008
(next!)
  (prev!)

  )

(defn slide-8-half
  "The browser didn't want to miss the party...
  - Ajax
  - MVC frameworks
  - MVVC
  - ES5 ES6
  - websockets
  - webRTC"
  [!db]
  [:li#slide-1
   [:div.cd-slider-content {:style {:margin-left "130px"}}
    [:div.content-wrapper
     [:img {:src "/images/browser-s.png"}]]]])
























(comment

(next!)
  (prev!)

  )

(defn slide-8-allmost-nine
  "the mess"
  [!db]
  [:li#slide-1
   [:div.cd-slider-content {:style {:margin-left "130px"}}
    [:div.content-wrapper
     [:img {:src "/images/both-complex.png"}]]]])
























(comment
  ;;YEAR 2008
(next!)
  (prev!)

  )


(defn slide-9
  "The secret is revealed
  if you only take away one thing from this talk this is the one

  If you are a web developer you are on the
  Distributed Systems BUISNESS!!!"
  [!db]
  [:li#slide-1
   [:div.cd-slider-content {:style {:margin-left "130px"}}
    [:div.content-wrapper
     [:h2 "_"]
     [:h3 "The Secret"]
     [:h2 "Web Development is"]
     [:h2 "Distributed Systems Programming"]]]])

























(comment
  ;;YEAR 2008
(next!)
  (prev!)

  )

(defn slide-10
  "But I was not alone in the world
  came for the first time to codebits

  - who was also here in 2008?"
  [!db]
  [:li#slide-1
   [:div.cd-slider-content {:style {:margin-left "130px"}}
    [:div.content-wrapper
     [:h3 "Codebits 2008"]]]])


















(comment
  ;;YEAR 2008
(next!)
  (prev!)

  )


(defn slide-11
  "
  Is Mario valente around? lol

  So there was alot of people also realinsing that is was getting a mess


  - A new javascript thing that was going to ramp up
  - How crazy you need to be to say this in 2008


  - And all is talk was a bash on what we were doing what kind of monster we were creating"
  [!db]
  [:li#slide-1
   [:div.cd-slider-content {:style {:margin-left "130px"}}
    [:div.content-wrapper
     [:h3 "Codebits 2008"]
     [:h2 {:style {:font-size "70px"}} "\"Serverside Javascript"]
     [:h2 {:style {:font-size "70px"}} "Hope & opportunity\""]
     [:img {:src "/images/mv.gif"}]
     [:h4 "Mario Valente"]]]])
























(comment
  ;;YEAR 2010
(next!)
  (prev!)

  )

(defn slide-12
  "but sorts out he was right
  - Javascript race for speed
  - all big players (google mozzila opera oracle microsoft)
  - all they start to build JS virtual machines"
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
  "Javascript is not a toy language for designers"
  [!db]
  [:li#slide-1
   [:div.cd-slider-content {:style {:margin-left "130px"}}
    [:div.content-wrapper
     [:h3 "Hope in Javascript"]
     [:h2 "Javascript"]
     [:h2 "starts to eat"]
     [:h2 "the world!"]]]])





















(comment
  ;;YEAR 2014
(next!)
  (prev!)

  )

(defn slide-14
  "nodejs, npm, ES6, babel, reactJS, angularJS"
  [!db]
  [:li#slide-1
   [:div.cd-slider-content {:style {:margin-left "130px"}}
    [:div.content-wrapper
     [:h3 "Hope in Javascript"]
     [:h2 "- nodejs"]
     [:h2 "- npm"]
     [:h2 "- ES6"]]]])



























(comment
  ;;YEAR Jun 11, 2013
(next!)
  (prev!)

  )

(defn slide-14-and-half
  "
  Open the browser first commit!
  I got inspired and created with some friends the require('lx') meetup
  - Good Times! "
  [!db]
  [:li#slide-1
   [:div.cd-slider-content {:style {:margin-left "130px"}}
    [:div.content-wrapper
     [:h3 "Hope in Javascript"]
     [:img {:src "/images/requirelx_blue.svg"
            :style {:width  "700px"
                    :height "407px"}}
      ]]]])






























(comment
  ;;YEAR 2015
(next!)
  (prev!)

  )

(defn slide-15
  "This were amzing times
  Functional programing started to became a thing
  Async I/O
  Javascript the assembly of the web"
  [!db]
  [:li#slide-1
   [:div.cd-slider-content {:style {:margin-left "130px"}}
    [:div.content-wrapper
     [:h3 "Hope in Javascript"]
     [:h2 {:style {:font-size "70px"}} "- first functional language to get into the masses"]
     [:h2 {:style {:font-size "70px"}} "- async i/o by default"]
     [:h2 {:style {:font-size "70px"}} "- everything _compiles_  to javascript"]]]])





















(comment
  ;;YEAR 2016 PRESENT TIME!!!
(next!)
  (prev!)

  )

(defn slide-16
  "Continueing to having hope...
  Are we there yet?
  I don't know if you guys have read the recent state of art javascript posts
  I could go on a rant here on JS
  But I have something better to show ! :)"
  [!db]
  [:li#slide-1
   [:div.cd-slider-content {:style {:margin-left "130px"}}
    [:div.content-wrapper
     [:h3 "Are we"]
     [:h3 "there yet?"]]]])
























(comment

(next!)
  (prev!)

  )

;; revenge
(defn slide-17
  "Rich Hickey come and invented clojure
  -
  - its all about old good ideas
  - "
  [!db]
  [:li#slide-1
   [:div.cd-slider-content
    [:div.content-wrapper
     [:img {:src   "/images/state.jpeg"
            :style {:position    "absolute"
                    :top         0
                    :zoom        1.5
                    :left        "50%"
                    :margin-left "-250px"}}]]]])






















(comment

(next!)
  (prev!)

  )

(defn slide-18
  "What is this"
  [!db]
  [:li#slide-1
   [:div.cd-slider-content {:style {:margin-left "130px"}}
    [:div.content-wrapper
     [:h3 "Clojure"]
     [:h3 "ClojureScript"]]]])





















(comment

(next!)
  (prev!)

  )

(defn slide-19
  "What is this
  You can see the shark as the JVM and that small fish as

  It uses the JVM as host plataform
  compiles to JVM bytecode
  Interop to Java libraries
  it is 100% compatible with all Java code"
  [!db]
  [:li#slide-1
   [:div.cd-slider-content {:style {:margin-left "130px"}}
    [:div.content-wrapper
     [:h3 "Clojure"]
     [:img {:src "/images/shark_clojure.jpg"}]]]])

















(comment

(next!)
  (prev!)

  )


(defn slide-20
  "What is this

  Same Idea but for JAVASCRPIT VM

  Uses google closure because JS doesn't have standard library
  Emits high performace JS
  dead code elemination

  Closure has nothing todo with clojure

  - show the IMAGEE!!!"
  [!db]
  [:li#slide-1
   [:div.cd-slider-content {:style {:margin-left "130px"}}
    [:div.content-wrapper
     [:h3 "ClojureScript"]
     [:img {:src   "/images/rino_clojureScript.png"
            :style {:width  "700px"
                    :height "407px"}}]]]])


















(comment

(next!)
  (prev!)

  )

(defn slide-21
  "What is this"
  [!db]
  [:li#slide-1
   [:div.cd-slider-content {:style {:margin-left "130px"}}
    [:div.content-wrapper
     [:h3 "What makes it special?"]
     [:h2 "- LISP!"]
     [:h2 "- Functional Programming"]
     [:h2 "- Immutable data-structures"]
     [:h2 "- Lazy"]
     [:h2 "- Communicating Sequential Processes (CSP) Ala Go-Lang"]]]])



























(comment

(next!)
  (prev!)

  )
(defn slide-22
  "Okay let's code..."
  [!db]
  [:li#slide-1
   [:div.cd-slider-content {:style {:margin-left "130px"}}
    [:div.content-wrapper
     [:h3 "SHow me some code!"]]]])




;;;BUT FIRST SOME syntaxxxx

;;;;;Parentisis



















(comment

(next!)
  (prev!)
  )
(defn slide-23
  "sintaxxx... Parentesiss!!!
  - You already seen it trust me
  - its only on different places
  I really don't get why people even come with this what they keyboard does't have parenthesis?
  what???



  Its a solved problem! editors solve it you have paredit pareinfer
   Tooling  next slide
  "
  [!db]
  [:li#slide-1
   [:div.cd-slider-content {:style {:margin-left "130px"}}
    [:div.content-wrapper
     [:h3 "( )"]]]])





















(comment

(next!)
  (prev!)
  )

(defn slide-24
  "ahhh and tooling"
  [!db]
  [:li#slide-1
   [:div.cd-slider-content {:style {:margin-left "130px"}}
    [:div.content-wrapper
     [:h3 "Tools"]
     [:h2 "- Emacs"]
     [:h2 "- Vim"]
     [:h2 "- intelliJ (cursive)"]
     [:h2 "- sublime, atom, VScode"]]]])







;; STOP!!!! GO to the REPL!!!!!
;; STOP!!!! GO to the REPL!!!!!
;; STOP!!!! GO to the REPL!!!!!



;;; Show CODE!!!






















;;REPL!!
(comment
  ;;primitives:

  123456765432 ;; Arbitrary precision integers

  33.3 ;;doubles

  1/3 ;; Ratios ;; clojure only

  "beep boop" ;; Strings

  \a \b \c ;; Characters

  :fred :ethel ;; keywords

  false ;; Booleans
  true ;; Booleans

  nil ;; null

  #"a*b" ;; Regex pattern

  )














;;data-structures
(comment

  ;; Lists (the classic LISP data-structures new items added at the front)
  '(1 2 3 4 5)
  ;;^^^^ they are also used to reprensent clojure code

  (println "hello" "world")



  ;; Vectors (new values added at the end)
  [1 2 3]

  ;;Maps
  {:first-name "To"
   :last-name  "Traves"}

  (def testee {:first-name "To"
               :last-name  "Traves"})


  (:first-name testee)

  {1 "Bruno"
   2 "Barreto"}

  ;;sets
  #{"zzz" "weee" "brrr"})

;; everything nests!










;;functions

(comment

  (def person {:first-name "ze"
               :last-name "bala"})

  (defn average [& nums]
    (/ (reduce + nums)
      (count nums)))


  (average 4 11)


  (average 3.0 72 9.8 33)


  ;; Sum the first 100 even numbers
  (reduce + (take 100 (filter even? (range))))

  )



;;show CSS -> Garden

;;SHOW HTML

;;SHow





















(comment

(next!)
  (prev!)

  )

(defn slide-25
  "Continuing on the Tooling"
  [!db]
  [:li#slide-1
   [:div.cd-slider-content {:style {:margin-left "130px"}}
    [:div.content-wrapper
     [:h3 "Tooling"]
     [:h2 "- Lein"]
     [:h2 "- Figwheel"]]]])

























(comment

(next!)
  (prev!)
  )
;; mention OM react faster...

(defn slide-26
  "frameworks libraries modules"
  [!db]
  [:li#slide-1
   [:div.cd-slider-content {:style {:margin-left "130px"}}
    [:div.content-wrapper
     [:h3 "Clojars"] ;; package manager
     [:h2 "- OM, reagent, RUM, quiscent"]
     [:h2 "- Garden"]
     [:h2 ""]
     [:h2 ""]]]])

























(comment

(next!)
  (prev!)
  )

(defn slide-27
  "More stuff that is important... the we didn't had time to speak"
  [!db]
  [:li#slide-1
   [:div.cd-slider-content {:style {:margin-left "130px"}}
    [:div.content-wrapper
     [:h3 "Immutable datastructures"]
     [:h3 "CSP"]
     [:h3 "datomic"]
     [:h3 ""]]]])






















(comment

(next!)
  (prev!)

  )

(defn slide-28
  "Links references"
  [!db]
  [:li#slide-1
   [:div.cd-slider-content {:style {:margin-left "130px"}}
    [:div.content-wrapper
     [:h3 ""]
     [:h3 "CSP"]
     [:h3 "datomic"]
     [:h3 ""]]]])




































(defn slide-29
  "Thanks"
  [!db]
  [:li#slide-1
   [:div.cd-slider-content {:style {:margin-left "130px"}}
    [:div.content-wrapper
     [:img {:src "/images/thank_you.png"}]]]])




