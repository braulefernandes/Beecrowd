(def inicio (read))
(def final (read))

(defn calculoHorasJogo [inicio final]
  (cond 
    (< final inicio) (+ 24 (- final inicio))
    (= inicio final) 24
    :else (- final inicio)))

(def horasJogo (calculoHorasJogo inicio final))

(printf "O JOGO DUROU %d HORA(S)\n" horasJogo)