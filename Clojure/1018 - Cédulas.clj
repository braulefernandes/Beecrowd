(let [valor (Integer/parseInt (read-line))
      notas [100 50 20 10 5 2 1]]
  (println valor)
  (loop [v valor n notas]
    (when (seq n)
      (let [nota (first n)
            quantidade (quot v nota)]
        (println (format "%d nota(s) de R$ %d,00" quantidade nota))
        (recur (mod v nota) (rest n))))))