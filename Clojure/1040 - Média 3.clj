(def N1 (read))
(def N2 (read))
(def N3 (read))
(def N4 (read))

(defn media [N1 N2 N3 N4]
    (/ (+ (* N1 2) (* N2 3) (* N3 4) (* N4 1)) 10)
    )

(def valorMedia (media N1 N2 N3 N4))
(printf "Media: %.1f\n" (float valorMedia))

(cond
    (>= valorMedia 7.0) (printf "Aluno aprovado.\n")
    (< valorMedia 5.0) (printf "Aluno reprovado.\n")
    :else (do 
       (printf "Aluno em exame.\n")
       (def N5 (read))
       (printf "Nota do exame: %.1f\n" N5)
       (def novaMedia (/ (+ valorMedia N5 ) 2))
       (cond
            (>= novaMedia 5.0) (printf "Aluno aprovado.\n")
            :else (printf "Aluno reprovado.\n")          
           )
       (printf "Media final: %.1f\n" (float novaMedia))
        )
    )