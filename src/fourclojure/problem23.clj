(ns fourclojure.problem23)

(defn reverse-1
  ([xs] (reverse-1 xs '()))
  ([xs acc]
    (if (seq xs)
      (recur (rest xs) (conj acc (first xs)))
      acc)))