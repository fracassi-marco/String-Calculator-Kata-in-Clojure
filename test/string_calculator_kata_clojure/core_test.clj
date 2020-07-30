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

(deftest handle-an-unknown-amount-of-numbers
  (testing "sum five values"
    (let [sum (calculate "1,2,3,4,5")]
      (is (= sum 15))
    )
  )
)

(deftest handle-new-lines-between-numbers
  (testing "handle new lines between numbers"
    (let [sum (calculate "1\n2,3")]
      (is (= sum 6))
    )
  )
)

(deftest support-different-delimiters
  (testing "support different delimiters"
    (let [sum (calculate "//;\n1;2")]
      (is (= sum 3))
    )
  )
)