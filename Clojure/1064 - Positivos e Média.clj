(defn cont-pos [x]
    (count (filter pos? x))
    )

(defn media [y]
    (/ (reduce + (filter pos? y)) (cont-pos y))
    )

(defn main []
    (def valores (repeatedly 6 read))
    (println (cont-pos valores) "valores positivos")
    (printf "%.1f\n" (media valores))
    )

(main)