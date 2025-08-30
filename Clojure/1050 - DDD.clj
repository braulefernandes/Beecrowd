(def DDD (read))

(cond 
    (== DDD 61) (printf "Brasilia\n")
    (== DDD 71) (printf "Salvador\n")
    (== DDD 11) (printf "Sao Paulo\n")
    (== DDD 21) (printf "Rio de Janeiro\n")
    (== DDD 32) (printf "Juiz de Fora\n")
    (== DDD 19) (printf "Campinas\n")
    (== DDD 27) (printf "Vitoria\n")
    (== DDD 31) (printf "Belo Horizonte\n")
    :else (printf "DDD nao cadastrado\n")
    )