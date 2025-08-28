(let [entrada (map #(Integer/parseInt %) (clojure.string/split (read-line) #"\s+"))
      [a b c] entrada
      vetor [a b c]
      vetor-ordenado (vec (sort vetor))]
  (doseq [x vetor-ordenado]
    (println x))
  (println)
  (doseq [x vetor]
    (println x)))