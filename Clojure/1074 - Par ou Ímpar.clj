(let [N (Integer/parseInt (read-line))]
  (dotimes [_ N]
    (let [x (Integer/parseInt (read-line))]
      (if (= x 0)
        (println "NULL")
        (let [tipo (if (zero? (mod x 2)) "EVEN" "ODD")
              sinal (if (> x 0) "POSITIVE" "NEGATIVE")]
          (println (str tipo " " sinal)))))))