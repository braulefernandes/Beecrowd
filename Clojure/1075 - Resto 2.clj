(defn restoDois [valor]
  (reduce (fn [listaResto i]
     (if (= (mod i valor) 2)
       (conj listaResto i)
       listaResto))
   []
   (range 1 10001)))

(defn imprimir-resultados [valores]
  (doseq [i valores] 
    (println i)))

(defn main []
  (def valor (read))
  (imprimir-resultados (restoDois valor)))

(main)