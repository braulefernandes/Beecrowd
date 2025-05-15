(def nomeVendedor (read))
(def salario (read))
(def valorVendas (read))

(def salarioTotal (+ salario (* valorVendas 0.15)))

(printf "TOTAL = R$ %.2f\n" salarioTotal)