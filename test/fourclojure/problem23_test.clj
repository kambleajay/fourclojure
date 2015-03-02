(ns fourclojure.problem23_test
  (:require [clojure.test :refer :all]
            [fourclojure.problem23 :refer [reverse-1]]))

(deftest test-reverse
  (testing "returns the total number of elements in a sequence"
    (is (= (reverse-1 [1 2 3 4 5]) [5 4 3 2 1]))
    (is (= (reverse-1 (sorted-set 5 7 2 7)) '(7 5 2)))
    (is (= (reverse-1 [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]]))))
