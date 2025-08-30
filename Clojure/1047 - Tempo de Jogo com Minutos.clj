(def horaInicial (read))
(def minutoInicial (read))
(def horaFinal (read))
(def minutoFinal (read))

(cond 
  (and (= (- horaFinal horaInicial) 1) (> minutoInicial minutoFinal))
  (do
    (def minuto (+ (- 60 minutoInicial) minutoFinal))
    (printf "O JOGO DUROU 0 HORA(S) E %d MINUTO(S)\n" minuto))

  (and (= horaInicial horaFinal) (= minutoInicial minutoFinal))
  (printf "O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)\n")

  (and (< horaInicial horaFinal) (< minutoInicial minutoFinal))
  (do
    (def hora (- horaFinal horaInicial))
    (def minuto (- minutoFinal minutoInicial))
    (printf "O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n" hora minuto))

  (and (< horaInicial horaFinal) (> minutoInicial minutoFinal))
  (do
    (def hora (- horaFinal horaInicial 1))
    (def minuto (+ (- 60 minutoInicial) minutoFinal))
    (printf "O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n" hora minuto))

  (and (= horaInicial horaFinal) (< minutoInicial minutoFinal))
  (do
    (def minuto (- minutoFinal minutoInicial))
    (printf "O JOGO DUROU 0 HORA(S) E %d MINUTO(S)\n" minuto))

  :else
  (do
    (def hora (+ (- 24 horaInicial) horaFinal))
    (def minuto (- minutoFinal minutoInicial))
    (if (> minutoInicial minutoFinal)
      (do
        (def hora (- hora 1))
        (def minuto (+ (- 60 minutoInicial) minutoFinal))))
    (printf "O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n" hora minuto)))
