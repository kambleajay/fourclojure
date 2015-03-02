(ns fourclojure.problem24)

(defn sum-1
  ([xs] (sum-1 xs 0))
  ([xs acc]
    (if (seq xs)
      (recur (rest xs) (+ acc (first xs)))
      acc)))