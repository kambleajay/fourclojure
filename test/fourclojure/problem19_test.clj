(ns fourclojure.problem19_test
  (:require [clojure.test :refer :all]
            [fourclojure.problem19 :refer [get-last]]))

(deftest test-get-last
  (testing "returns the last element"
    (is (= (get-last [1 2 3 4 5]) 5))
    (is (= (get-last '(5 4 3)) 3))
    (is (= (get-last ["b" "c" "d"]) "d"))))
