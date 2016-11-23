(ns multitest.core
  (:gen-class)
  (:require [multitest.defs :as defs]
            [multitest.other]))

(defn -main
  "I don't do a whole lot."
  [args]
  (defs/foo {:bar "lol"}))
