(ns clj-do.to-do-list
  (:require [clojure.spec.alpha :as s]))

(s/def ::to-do-list (s/keys :req-un [::title]))

(defn make "Makes a to-do-list"
  [title]
  {:post [(s/valid? ::to-do-list %)]}
  (let [title (if (and (string? title)
                       (>
                        (count title)
                        0))
                title
                "To-Dos")]
    {:title title}))

(defn add-task [to-do-list task] nil)

(comment
  (add-task (make nil) nil)
  :rcf)
