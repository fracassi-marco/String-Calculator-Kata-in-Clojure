(ns string-calculator-kata-clojure.core-test
  (:require [clojure.test :refer :all]
            [string-calculator-kata-clojure.core :refer :all]))

(deftest empty-string-is-0
  (testing "empty string is 0"
    (def sum (calculate ""))
    (is (= sum 0))
  )
)
