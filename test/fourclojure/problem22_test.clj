(ns fourclojure.problem22_test
  (:require [clojure.test :refer :all]
            [fourclojure.problem22 :refer [count1]]))

(deftest test-count
  (testing "returns the total number of elements in a sequence"
    (is (= (count1 '(1 2 3 3 1)) 5))
    (is (= (count1 "Hello World") 11))
    (is (= (count1 [[1 2] [3 4] [5 6]]) 3))
    (is (= (count1 '(13)) 1))
    (is (= (count1 '(:a :b :c)) 3))))
