(def raio (read))

(def volume (* (/ 4 3) 3.14159 (Math/pow raio 3)))
(printf "VOLUME = %.3f\n" volume)