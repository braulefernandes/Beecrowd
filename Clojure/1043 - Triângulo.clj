(def a (read))
(def b (read))
(def c (read))

(cond
    (and (> (+ a b) c) 
         (> (+ a c) b) 
         (> (+ b c) a)) (printf "Perimetro = %.1f\n" (float (+ a b c)))
    :else (printf "Area = %.1f\n" (float (/ (* (+ a b) c) 2.0)))
    )