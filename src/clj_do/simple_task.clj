(ns clj-do.simple-task
  (:require [clojure.spec.alpha :as s]))

(s/def ::simple-task (s/keys :req-un [::description ::completed]))

(defn make "Makes a simple task" 
  [description is-completed]
  {:post [(s/valid? ::simple-task %)]}
  (let [description (if (nil? description)
                      ""
                      description)]
    {:description description
     :completed is-completed}))