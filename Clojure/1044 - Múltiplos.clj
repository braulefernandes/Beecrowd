(def a (read))
(def b (read))

(cond
    (or (= (mod a b) 0) (= (mod b a) 0)) (printf "Sao Multiplos\n")
    :else (printf "Nao sao Multiplos\n")
    )