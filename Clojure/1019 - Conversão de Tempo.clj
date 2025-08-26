(def tempo-total (read))

(def horas (int (/ tempo-total 3600)))
(def resto-hora (mod tempo-total 3600))
(def minutos (int (/ resto-hora 60)))
(def segundos (mod resto-hora 60))

(printf "%d:%d:%d\n" horas minutos segundos)