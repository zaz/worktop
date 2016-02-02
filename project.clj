(defproject worktop "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/core.logic "0.8.10"]
                 [net.mikera/core.matrix "0.47.0"]
                 [org.clojure/math.combinatorics "0.1.1"]
                 [expresso "0.2.2-SNAPSHOT"]
                 [com.taoensso/timbre "4.1.4"]]
  :target-path "target/%s"
  :plugins [[lein-gorilla "0.3.5"]]
  :main ^:skip-aot gorilla-test.core
  :profiles {:uberjar {:aot :all}})
