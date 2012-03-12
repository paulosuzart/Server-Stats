(defproject serverStats "1.0.0-SNAPSHOT"
  :description "Framework for ssh-based server stats and monitoring"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [org.apache.commons/commons-email "1.2"]
                 [parallelSSH "1.0.0-SNAPSHOT"]
                 [org.clojure/tools.cli "0.2.1"]
                 [org.clojars.ghoseb/twilio-java "3.0.0-fix2"]]
  :main serverStats.core)
