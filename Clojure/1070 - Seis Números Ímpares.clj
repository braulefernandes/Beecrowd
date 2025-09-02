(def numeroRepeticoes (read))

(if (= (mod numeroRepeticoes 2) 0)
  (def numeroRepeticoes (+ numeroRepeticoes 1)))

(doall (map println (range numeroRepeticoes (+ numeroRepeticoes 12) 2)))