(ns string-calculator-kata-clojure.core
  (:gen-class))

(require '[clojure.string :as str])  

(defn sum [numbers]
  (reduce + numbers)
)

(defn mapToInt [texts]
  (map (fn [x] (Integer/parseInt x)) texts)
)

(defn splitBy [separator, text]
  (str/split text separator)
)

(defn calculate [text]  
  (if (= text "")
    0
    (sum (mapToInt (splitBy #"(,|\n)" text)))
  )
)

(defn -main  
  [& args]  
  (println (str "The sum is " (calculate (first args))))
)
