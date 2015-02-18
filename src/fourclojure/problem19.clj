(ns fourclojure.problem19)

(defn get-last
  "returns last element in a sequence"
  [xs]
  (when (seq xs)
    (if (= (count xs) 1)
      (first xs)
      (recur (rest xs)))))