(ns cljs-gravatar.core-test
  (:require [cljs.test :refer-macros [deftest is testing]]
            [cljs-gravatar.core :as gravatar]))

(deftest test-url
  (is (= (gravatar/url "any") "534b44a19bf18d20b71ecc4eb77c572f")))
