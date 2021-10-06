(def slf4j-version "1.7.32")
(def logback-version "1.2.6")

(defproject spootnik/unilog "0.7.29-SNAPSHOT"
  :description "logging should be easy!"
  :url "https://github.com/pyr/unilog"
  :license {:name "MIT License"
            :url  "https://github.com/pyr/unilog/tree/master/LICENSE"}
  :plugins [[lein-ancient "0.7.0"]]
  :pedantic? :abort
  :dependencies [[org.clojure/clojure                           "1.10.3"]
                 [net.logstash.logback/logstash-logback-encoder "6.6"]
                 [org.slf4j/slf4j-api                           ~slf4j-version]
                 [org.slf4j/log4j-over-slf4j                    ~slf4j-version]
                 [org.slf4j/jul-to-slf4j                        ~slf4j-version]
                 [org.slf4j/jcl-over-slf4j                      ~slf4j-version]
                 [ch.qos.logback/logback-classic                ~logback-version]
                 [ch.qos.logback/logback-core                   ~logback-version]]
  :deploy-repositories [["releases" :clojars] ["snapshots" :clojars]]
  :profiles {:dev  {:dependencies [[org.clojure/tools.logging "1.1.0"]
                                   [metosin/jsonista          "0.3.4"
                                    :exclusions [com.fasterxml.jackson.core/*]]]
                    :pedantic?    :ignore
                    :plugins      [[lein-ancient "0.7.0"]]
                    :global-vars  {*warn-on-reflection* true}}
             :test {:dependencies [[org.clojure/tools.logging "1.1.0"]
                                   [metosin/jsonista          "0.3.4"
                                    :exclusions [com.fasterxml.jackson.core/*]]]
                    :plugins      [[lein-difftest "2.0.0"]
                                   [lein-cljfmt "0.8.0"]]
                    :pedantic?    :abort}})
