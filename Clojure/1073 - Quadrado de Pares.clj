(def numeroRepeticoes (read))

(defn quadradoNumero [n]
    (printf "%d^2 = %d\n" n (* n n))
    )

(doall (map quadradoNumero (range 2 (+ numeroRepeticoes 1) 2)))