(let [valor (Double/parseDouble (read-line))
      centavos-inicial (int (Math/round (* valor 100)))
      notas [10000 5000 2000 1000 500 200]
      moedas [100 50 25 10 5 1]]
  
  (println "NOTAS:")
  (let [resto-notas (reduce (fn [centavos nota]
                              (let [quantidade (quot centavos nota)]
                                (println (format "%d nota(s) de R$ %.2f" quantidade (/ nota 100.0)))
                                (mod centavos nota)))
                            centavos-inicial
                            notas)]

    (println "MOEDAS:")
    (reduce (fn [centavos moeda]
              (let [quantidade (quot centavos moeda)]
                (println (format "%d moeda(s) de R$ %.2f" quantidade (/ moeda 100.0)))
                (mod centavos moeda)))
            resto-notas
            moedas)))