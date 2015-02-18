(ns fourclojure.problem20)

(defn second-to-last
  "get second to last element"
  [xs]
  (when xs
    (if (= (count xs) 2)
      (first xs)
      (recur (rest xs)))))