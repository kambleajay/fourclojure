(ns fourclojure.problem24_test
  (:require [clojure.test :refer :all]
            [fourclojure.problem24 :refer [sum-1]]))

(deftest test-sum
  (testing "returns the total number of elements in a sequence"
    (is (= (sum-1 [1 2 3]) 6))
    (is (= (sum-1 (list 0 -2 5 5)) 8))
    (is (= (sum-1 #{4 2 1}) 7))
    (is (= (sum-1 '(0 0 -1)) -1))
    (is (= (sum-1 '(1 10 3)) 14))))
