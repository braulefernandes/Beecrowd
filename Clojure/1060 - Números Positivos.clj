(defn cont-pos [x]
    (count (filter pos? x))
    )

(defn main []
    (def valores (repeatedly 6 read))
    (println (cont-pos valores) "valores positivos")
    )

(main)