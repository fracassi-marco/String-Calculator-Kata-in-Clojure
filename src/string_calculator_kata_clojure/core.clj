(ns string-calculator-kata-clojure.core
  (:gen-class))

(require '[clojure.string :as str])  

(defn sum [numbers]
  (reduce + numbers)
)

(defn mapToInt [texts]  
  (let [numbers (map (fn [x] (Integer/parseInt x)) texts)]
    (let [negatives (filter (fn [x] (< x 0)) numbers)]
      (if (first negatives)
        (throw (Exception. (str "negatives not allowed: " (first negatives))))        
      )  
    )
    
    (filter (fn [x] (< x 1000)) numbers)
  )
)

(defn splitBy [separator, text]
  (str/split text separator)
)

(defn separator [text]
  (if (str/starts-with? text "//")
    (re-pattern (first (splitBy #"\n" (str/replace text #"//" ""))))
    #"(,|\n)"
  )
)

(defn subject [text]
  (if (str/starts-with? text "//")
    (last (splitBy #"\n" text))
    text
  )
)

(defn calculate [text]  
  (if (= text "")
    0
    (do
      (let [
        separator (separator text)
        subject (subject text)
        ]        
        (sum (mapToInt (splitBy separator subject)))
      )
    )
  )
)

(defn -main  
  [& args]  
  (println (str "The sum is " (calculate (first args))))
)
