(def tempo-total (read))

(def ano (int (/ tempo-total 365)))
(def resto-ano (mod tempo-total 365))
(def mes (int (/ resto-ano 30)))
(def dia (mod resto-ano 30))

(printf "%d ano(s)\n" ano)
(printf "%d mes(es)\n" mes)
(printf "%d dia(s)\n" dia)