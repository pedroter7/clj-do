(ns clj-do.to-do-list-test
  (:require [clojure.test :refer :all]
            [clj-do.to-do-list :as tdl]
            [faker.generate :as faker]))

((deftest make-test
   (testing "Makes a to-do-list with the given name"
     (let [title (faker/sentence)]
       (is (= title (:title (tdl/make title))))))))
