(ns string-calculator-kata-clojure.core
  (:gen-class))

(require '[clojure.string :as str])  

(defn sum [texts]
  (reduce + (map (fn [x] (Integer/parseInt x)) texts))
)

(defn calculate [text]  
  (if (= text "")
    0
    (sum (str/split text #","))
  )
)

(defn -main  
  [& args]  
  (println (str "The sum is " (calculate (first args))))
)
