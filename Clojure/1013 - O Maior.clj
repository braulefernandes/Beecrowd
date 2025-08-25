(let [inputs (map #(Integer/parseInt %) (clojure.string/split (read-line) #"\s+"))
      a (nth inputs 0)
      b (nth inputs 1)
      c (nth inputs 2)
      maiorAB (int (/ (+ a b (Math/abs (- a b))) 2))]
  (if (> maiorAB c)
    (println (format "%d eh o maior" maiorAB))
    (println (format "%d eh o maior" c))))