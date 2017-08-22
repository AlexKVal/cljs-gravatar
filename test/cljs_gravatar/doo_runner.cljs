(ns cljs-gravatar.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [cljs-gravatar.core-test]))

(doo-tests 'cljs-gravatar.core-test)
