(ns clj-do.to-do-list-test
  (:require [clojure.test :refer :all]
            [clj-do.to-do-list :as tdl]
            [faker.generate :as faker]))

(deftest make-test
  (testing "Makes a to-do-list with the given title"
    (let [title (faker/sentence)]
      (is (= title (:title (tdl/make title))))))
  (testing "When given title is nil, makes a to-do-list with title To-Dos"
    (is (= "To-Dos" (:title (tdl/make nil))))))