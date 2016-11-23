(ns multitest.core
  (:gen-class))

(defmulti foo :bar)

(defn -main
  "I don't do a whole lot."
  [args]
  (foo {:bar "lol"}))
