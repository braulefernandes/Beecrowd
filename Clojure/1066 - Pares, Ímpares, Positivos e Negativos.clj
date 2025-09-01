(defn cont-par [x]
    (count (filter even? x))
    )

(defn cont-impar [x]
    (count (filter odd? x))
    )

(defn cont-pos [x]
    (count (filter pos? x))
    )

(defn cont-neg [x]
    (count (filter neg? x))
    )

(defn main []
    (def valores (repeatedly 5 read))
    (println (cont-par valores) "valor(es) par(es)")
    (println (cont-impar valores) "valor(es) impar(es)")
    (println (cont-pos valores) "valor(es) positivo(s)")
    (println (cont-neg valores) "valor(es) negativo(s)")
    )

(main)