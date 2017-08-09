(defproject referron/on.heroku "1.0.0-SNAPSHOT"
  :description "Demo Clojure web app"
  :url "https://github.com/referron/on.heroku"
  :license {:name "Eclipse Public License v1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.4.0"]
                 [ring/ring-jetty-adapter "1.4.0"]
                 [environ "1.0.0"]
                 [com.datomic/datomic-pro "0.9.5561.54"
                  :exclusions [[com.google.guava/guava]]]]
  :min-lein-version "2.0.0"
  :plugins [[environ/environ.lein "0.3.1"]]
  :hooks [environ.leiningen.hooks]
  :uberjar-name "on.heroku.jar"
  :profiles {:production {:env {:production true}}}
  :repositories {"my.datomic.com" {:url "https://my.datomic.com/repo"
                                   :username "accounts@referron.com"
                                   :password "649a2f50-b4cd-412f-a75d-9a6c45d49418"}})
