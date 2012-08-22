(ns Zenpou-ni.test.core
  (:refer-clojure :exclude [compile])
  (:use [clojure.test]
        [noir.util.test]))

(deftest sample-test
  (is (= 4 (+ 2 2)) "Regular test")
  (is (instance? Integer 256))
  (is (.startsWith "acbcde" "ab")) "Fail test")