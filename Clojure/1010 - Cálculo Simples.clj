(defn ler-linha-para-floats []
  (map #(Double/parseDouble %) (clojure.string/split (read-line) #" ")))

(let [[_ np1 vup1] (ler-linha-para-floats)
      [_ np2 vup2] (ler-linha-para-floats)
      soma1 (* np1 vup1)
      soma2 (* np2 vup2)
      total (+ soma1 soma2)]
  (println (format "VALOR A PAGAR: R$ %.2f" total)))