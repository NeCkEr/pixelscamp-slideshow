(ns slides.api)

(defonce !history nil)

(defn save-history!
  [db]
  (swap! !history (fn [history]
                    (-> history
                      (assoc :history-index (inc (:history-index history)))
                      (assoc :history (conj (:history history) db)))))
  db)

(defn back-in-history!
  []
  (let [previous-history (butlast (:history @!history))]
    (swap! !history (fn [history]
                      (-> history
                        (assoc :history-index (dec (:history-index history)))
                        (assoc :history (into [] previous-history)))))
    (last previous-history)))

(defn next-slide! [db]
  (let [current-slide (:current-slide db)]
    (save-history!
      (assoc db :current-slide (+ current-slide 1)))))

(defn previous-slide!
  [db]
  (if (> (:current-slide db) 0)
    (back-in-history!)
    db))