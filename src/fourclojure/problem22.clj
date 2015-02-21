(ns fourclojure.problem22)

(defn count1
  ([xs] (count1 xs 0))
  ([xs acc]
   (if (seq xs)
     (recur (rest xs) (inc acc))
     acc)))