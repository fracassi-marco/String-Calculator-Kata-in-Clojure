(ns string-calculator-kata-clojure.core-test
  (:require [clojure.test :refer :all]
            [string-calculator-kata-clojure.core :refer :all]))

(deftest empty-string-is-0
  (testing "empty string is 0"
    (let [sum (calculate "")]
      (is (= sum 0))
    )
  )
)

(deftest sum-one-value
  (testing "sum one value"
    (let [sum (calculate "8")]
      (is (= sum 8))
    )
  )
)

(deftest sum-two-values
  (testing "sum tho values"
    (let [sum (calculate "8,2")]
      (is (= sum 10))
    )
  )
)