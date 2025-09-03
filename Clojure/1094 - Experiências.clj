(defn coelhoVetor [coelho v]
    (if (= (str (last v)) "C")
        (conj coelho (first v))
        coelho
    )
)

(defn ratoVetor [rato v]
    (if (= (str (last v)) "R")
        (conj rato (first v))
        rato
    )
)

(defn sapoVetor [sapo v]
    (if (= (str (last v)) "S")
        (conj sapo (first v))
        sapo
    )
)

(defn porcentagem [n]
    (format "%.2f" (* 100 (float n)))
)

(defn main []
    (let [n (read)
          vetor (repeatedly n #(repeatedly 2 read))
          qntCoelho (reduce + (reduce coelhoVetor [] vetor))
          qntRato (reduce + (reduce ratoVetor [] vetor))
          qntSapo (reduce + (reduce sapoVetor [] vetor))
          total (+ qntCoelho qntRato qntSapo)]
        
        (println "Total:" total "cobaias")
        (println "Total de coelhos:" qntCoelho)
        (println "Total de ratos:" qntRato)
        (println "Total de sapos:" qntSapo)
        (println "Percentual de coelhos:" (porcentagem (/ qntCoelho total)) "%")
        (println "Percentual de ratos:" (porcentagem (/ qntRato total)) "%")
        (println "Percentual de sapos:" (porcentagem (/ qntSapo total)) "%")
    )
)

(main)