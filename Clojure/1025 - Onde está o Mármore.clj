(defn binary-search [arr x]
  (loop [inicio 0
         fim (count arr)]
    (if (< inicio fim)
      (let [meio (quot (+ inicio fim) 2)]
        (if (< (nth arr meio) x)
          (recur (inc meio) fim)
          (recur inicio meio)))
      inicio)))

(let [caso (atom 0)]
  (loop []
    (let [entrada (read-line)]
      (when entrada
        (let [[N Q] (map #(Integer/parseInt %) (clojure.string/split entrada #"\s+"))]
          (when-not (and (= N 0) (= Q 0))
            (let [marmores (loop [i 0 acc []]
                             (if (< i N)
                               (recur (inc i) (conj acc (Integer/parseInt (read-line))))
                               (vec (sort acc))))]
              (swap! caso inc)
              (println (format "CASE# %d:" @caso))
              (dotimes [_ Q]
                (let [consulta (Integer/parseInt (read-line))
                      pos (binary-search marmores consulta)]
                  (if (or (>= pos (count marmores))
                          (not= (nth marmores pos) consulta))
                    (println (format "%d not found" consulta))
                    (println (format "%d found at %d" consulta (inc pos)))))))
            (recur)))))))