(ns clj-do.to-do-list
  (:require [clojure.spec.alpha :as s]))

(s/def ::to-do-list (s/keys :req-un [::title]))

(defn make "Makes a to-do-list"
  [title]
  {:post [(s/valid? ::to-do-list %)]}
  {:title title})

(comment
  (make "Hello")
  :rcf)

