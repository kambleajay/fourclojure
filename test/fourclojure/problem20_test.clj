(ns fourclojure.problem20_test
  (:require [clojure.test :refer :all]
            [fourclojure.problem20 :refer [second-to-last]]))

(deftest test-get-last
  (testing "returns the last element"
    (is (= (second-to-last (list 1 2 3 4 5)) 4))
    (is (= (second-to-last ["a" "b" "c"]) "b"))
    (is (= (second-to-last [[1 2] [3 4]]) [1 2]))))
