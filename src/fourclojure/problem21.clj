(ns fourclojure.problem21)

(defn get-nth
  [xs n]
  (when xs
    (if (= n 0)
      (first xs)
      (recur (rest xs) (dec n)))))