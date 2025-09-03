(def valor (read))

(defn tabuada [n]
    (printf "%d x %d = %d\n" n valor (* n valor))
    )

(doall (map tabuada (range 1 11)))