(ns multitest.other
  (:require [multitest.defs :as defs]))


(defmethod defs/foo "lol" [_]
  (println "you said lol"))
