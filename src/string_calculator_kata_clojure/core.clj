(ns string-calculator-kata-clojure.core
  (:gen-class))

(require '[clojure.string :as str])  

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn sum [texts]
  (reduce + (map (fn [x] (Integer/parseInt x)) texts))
)

(defn calculate [text]  
  (if (= text "")
    0
    (sum (str/split text #","))
  )
)
