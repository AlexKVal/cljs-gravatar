(defproject cljs-gravatar "0.1.0"
  :description "Gravatar url for ClojureScript"
  :url "https://github.com/alexkval/cljs-gravatar"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :clojurescript? true

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.908"]]

  :plugins [[lein-cljsbuild "1.1.7"]
            [lein-doo "0.1.7"]]

  :doo {:build "test"
        :alias {:default [:phantom]}}

  :cljsbuild
  {:builds
   {:dev  {:source-paths ["src"]
           :compiler {:output-to "target/main.js"
                      :optimizations :whitespace
                      :pretty-print true}}
    :test {:source-paths ["src" "test"]
           :compiler {:main cljs-gravatar.doo-runner
                      :output-to "target/test.js"
                      :optimizations :none
                      :pretty-print true}}}})
