(ns string-calculator-kata-clojure.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn calculate [text]
  (if (= text "")
    0
    (Integer/parseInt text)
  )
)
