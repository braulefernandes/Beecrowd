(defn cont-par [x]
    (count (filter even? x))
    )

(defn main []
    (def valores (repeatedly 5 read))
    (println (cont-par valores) "valores pares")
    )

(main)