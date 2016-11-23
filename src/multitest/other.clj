(ns multitest.other
  (:require [multitest.core :as core]))


(defmethod core/foo "lol" [_]
  (println "you said lol"))

