(ns utils)

(defn clearfix [clazz]
  [clazz {:*zoom 1}
   [:&:before :&:after {:display "table"
                        :content "     "
                        :line-height 0}]
   [:&:after {:clear "both"}]])
