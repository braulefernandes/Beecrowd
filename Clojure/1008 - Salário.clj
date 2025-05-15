(def numeroDoFuncionario (read))
(def horas (read))
(def valorHora (read))

(def salario (* horas valorHora))
(println "NUMBER =" numeroDoFuncionario)
(printf "SALARY = U$ %.2f\n" salario)