(defn testeIntervalo [x]
    (count (filter (fn [n] (and (>= n 10) (<= n 20))) x))
    )

(defn testeForaIntervalo [x]
    (count (filter (fn [n] (or (< n 10) (> n 20))) x))
    )

(defn main []
    (def repeticoes (read))
    (def valores (repeatedly repeticoes read))
    (println (testeIntervalo valores) "in")
    (println (testeForaIntervalo valores) "out")
    )

(main)