(defn maior [valores]
    (reduce max valores)
    )

(defn posicaoMaior [valores]
  (+ (.indexOf valores (maior valores)) 1)
    )


(defn main []
    (def valores (repeatedly 100 read))
    (println (maior valores))
    (println (posicaoMaior valores))
    )

(main)