(defn media-ponderada [a b c]
  (format "%.1f" (/ (+ (* a 2) (* b 3) (* c 5)) 10)))

(defn processar-valores [n]
  (let [valores (repeatedly n #(vector (read) (read) (read)))]
    (doseq [[a b c] valores]
      (println (media-ponderada a b c)))))

(defn main []
  (let [n (read)]
    (processar-valores n)))

(main)