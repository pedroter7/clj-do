(ns clj-do.simple-task-test
  (:require [clojure.test :refer :all]
            [clj-do.simple-task :as st]
            [faker.generate :as faker]))

(deftest make-test
  (testing "Makes a simple-task with the given values"
    (let [description (faker/sentence)
          is-completed (rand-int 2)]
      (is (=
           {:description description
            :completed is-completed}
           (st/make description is-completed)))))
  (testing "Makes task with empty description if no description is provided"
    (let [is-completed (rand-int 2)]
      (is (= "" (:description (st/make nil is-completed))))))
  (testing "Makes uncompleted task if is-completed is not provided"
    (let [description (faker/sentence)]
      (is (false? 
           (if (:completed (st/make description nil)) true false))))))

(comment
  (false? nil)
  :rcf)

