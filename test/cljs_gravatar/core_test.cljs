(ns cljs-gravatar.core-test
  (:require [cljs.test :refer-macros [deftest is testing]]
            [cljs-gravatar.core :as gravatar]))

(deftest test-url
  (is (= (gravatar/url "admin@example.com")
         "https://secure.gravatar.com/avatar/e64c7d89f26bd1972efa854d13d7dd61"))
  (is (= (gravatar/url "alexkval@gmail.com")
         "https://secure.gravatar.com/avatar/31c58505002afb68cfc6e6a0ceb7ae31"))
  (is (= (gravatar/url "alexkval@gmail.com" :size 50)
         "https://secure.gravatar.com/avatar/31c58505002afb68cfc6e6a0ceb7ae31?s=50"))
  (is (= (gravatar/url "alexkval@gmail.com" :size 50 :rating :pg)
         "https://secure.gravatar.com/avatar/31c58505002afb68cfc6e6a0ceb7ae31?s=50&r=pg"))
  (is (= (gravatar/url "alexkval@gmail.com" :rating :pg :default :404)
         "https://secure.gravatar.com/avatar/31c58505002afb68cfc6e6a0ceb7ae31?r=pg&d=404")))
