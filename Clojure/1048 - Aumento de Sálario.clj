(def salario (read))
(cond 
  (and (<= salario 400.00) (>= salario 0.00))
  (do
    (def reajuste (* salario 0.15))
    (def novoSalario (+ reajuste salario))
    (printf "Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 15 %%\n" novoSalario reajuste))

  (and (> salario 400.00) (<= salario 800.00))
  (do
    (def reajuste (* salario 0.12))
    (def novoSalario (+ reajuste salario))
    (printf "Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 12 %%\n" novoSalario reajuste))

  (and (> salario 800.00) (<= salario 1200.00))
  (do
    (def reajuste (* salario 0.10))
    (def novoSalario (+ reajuste salario))
    (printf "Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 10 %%\n" novoSalario reajuste))

  (and (> salario 1200.00) (<= salario 2000.00))
  (do
    (def reajuste (* salario 0.07))
    (def novoSalario (+ reajuste salario))
    (printf "Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 7 %%\n" novoSalario reajuste))

  :else
  (do
    (def reajuste (* salario 0.04))
    (def novoSalario (+ reajuste salario))
    (printf "Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 4 %%\n" novoSalario reajuste)))
