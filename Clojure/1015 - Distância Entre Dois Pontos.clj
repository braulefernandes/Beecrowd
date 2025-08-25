(let [linha1 (map #(Double/parseDouble %) (clojure.string/split (read-line) #"\s+"))
      linha2 (map #(Double/parseDouble %) (clojure.string/split (read-line) #"\s+"))
      x1 (nth linha1 0)
      y1 (nth linha1 1)
      x2 (nth linha2 0)
      y2 (nth linha2 1)
      distancia (Math/sqrt (+ (Math/pow (- x2 x1) 2)
                               (Math/pow (- y2 y1) 2)))]
  (println (format "%.4f" distancia)))