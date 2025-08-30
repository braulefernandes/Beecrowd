(let [renda (Double/parseDouble (read-line))
      imposto (atom 0.0)]
  (if (<= renda 2000.0)
    (println "Isento")
    (do
      (when (> renda 2000.0)
        (let [valor (- (min renda 3000.0) 2000.0)]
          (swap! imposto + (* valor 0.08))))
      (when (> renda 3000.0)
        (let [valor (- (min renda 4500.0) 3000.0)]
          (swap! imposto + (* valor 0.18))))
      (when (> renda 4500.0)
        (let [valor (- renda 4500.0)]
          (swap! imposto + (* valor 0.28))))
      (println (format "R$ %.2f" @imposto)))))