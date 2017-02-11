(defproject spootnik/unilog "0.7.19-SNAPSHOT"
  :description "logging should be easy!"
  :url "https://github.com/pyr/unilog"
  :license {:name "MIT License"
            :url "https://github.com/pyr/unilog/tree/master/LICENSE"}
  :plugins [[lein-codox "0.10.3"]]
  :codox {:source-uri "https://github.com/pyr/unilog/blob/{version}/{filepath}#L{line}"
          :metadata   {:doc/format :markdown}}
  :dependencies [[org.clojure/clojure                           "1.8.0"]
                 [cheshire                                      "5.7.0"]
                 [clj-time                                      "0.13.0"]
                 [org.slf4j/slf4j-api                           "1.7.22"]
                 [org.slf4j/log4j-over-slf4j                    "1.7.22"]
                 [org.slf4j/jul-to-slf4j                        "1.7.22"]
                 [ch.qos.logback/logback-classic                "1.2.0"]
                 [ch.qos.logback/logback-core                   "1.2.0"]]
  :profiles {:dev {:dependencies [[org.clojure/tools.logging "0.3.1"]]
                   :global-vars {*warn-on-reflection* true}}})
