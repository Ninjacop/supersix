;will update this later 

(defproject supersix "0.1.0-SNAPSHOT"
  :description "supersix - a clojure game"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot supersix.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
