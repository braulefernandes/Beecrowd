(defn mdc [a b]
  (if (zero? b)
    a
    (recur b (mod a b))))

(let [N (Integer/parseInt (read-line))]
  (dotimes [_ N]
    (let [entrada (clojure.string/split (read-line) #"\s+")
          n1 (Integer/parseInt (nth entrada 0))
          d1 (Integer/parseInt (nth entrada 2))
          op (nth entrada 3)
          n2 (Integer/parseInt (nth entrada 4))
          d2 (Integer/parseInt (nth entrada 6))
          [num den] (cond
                      (= op "+") [(+ (* n1 d2) (* n2 d1)) (* d1 d2)]
                      (= op "-") [(- (* n1 d2) (* n2 d1)) (* d1 d2)]
                      (= op "*") [(* n1 n2) (* d1 d2)]
                      (= op "/") [(* n1 d2) (* n2 d1)])
          divisor (mdc (Math/abs num) (Math/abs den))
          num-simpl (quot num divisor)
          den-simpl (quot den divisor)]
      (println (format "%d/%d = %d/%d" num den num-simpl den-simpl)))))