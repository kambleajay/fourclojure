(ns fourclojure.problem21_test
  (:require [clojure.test :refer :all]
            [fourclojure.problem21 :refer [get-nth]]))

(deftest test-get-nth
  (testing "returns the nth element"
    (is (= (get-nth '(4 5 6 7) 2) 6))
    (is (= (get-nth [:a :b :c] 0) :a))
    (is (= (get-nth [1 2 3 4] 1) 2))
    (is (= (get-nth '([1 2] [3 4] [5 6]) 2) [5 6]))))
