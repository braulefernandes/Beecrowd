(def codigo (read))
(def quantidade (read))

(cond
    (== codigo 1) (printf "Total: R$ %.2f\n" (* 4.00 quantidade))
    (== codigo 2) (printf "Total: R$ %.2f\n" (* 4.50 quantidade))
    (== codigo 3) (printf "Total: R$ %.2f\n" (* 5.00 quantidade))
    (== codigo 4) (printf "Total: R$ %.2f\n" (* 2.00 quantidade))
    (== codigo 5) (printf "Total: R$ %.2f\n" (* 1.50 quantidade))
    )