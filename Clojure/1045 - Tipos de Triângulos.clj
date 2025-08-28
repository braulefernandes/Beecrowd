(let [[A B C] (map #(Double/parseDouble %) (clojure.string/split (read-line) #"\s+"))
      [A B C] (let [[x y z] [A B C]]
                (let [[A1 B1] (if (> y x) [y x] [x y])
                      [A2 B2 C2] (if (> z A1) [z B1 A1] [A1 B1 z])]
                  [A2 B2 C2]))]
  (cond
    (>= A (+ B C)) (println "NAO FORMA TRIANGULO")
    (= (* A A) (+ (* B B) (* C C))) (println "TRIANGULO RETANGULO")
    (> (* A A) (+ (* B B) (* C C))) (println "TRIANGULO OBTUSANGULO")
    (< (* A A) (+ (* B B) (* C C))) (println "TRIANGULO ACUTANGULO"))
  
  (cond
    (and (= A B) (= B C)) (println "TRIANGULO EQUILATERO")
    (or (= A B) (= A C) (= B C)) (println "TRIANGULO ISOSCELES")))
