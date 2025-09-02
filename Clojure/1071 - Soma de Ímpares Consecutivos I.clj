(defn soma-impar [x]
    (reduce + (filter odd? (range (inc (first (sort x))) (second (sort x))))) 
        )

(defn main []
    (def valores (repeatedly 2 read))
    (println (soma-impar valores))
    )

(main)