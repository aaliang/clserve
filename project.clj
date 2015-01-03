(defproject clserve "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [io.vertx/clojure-api "1.0.2"]
                 ]
  :plugins [[lein-vertx "0.3.1"]
            [com.palletops/uberimage "0.4.1"]
            ]
  :main aserver.core
  :vertx {:main clserve.core/init
          :author "FIXME: Your name"
          :keywords ["FIXME: keywords"]
          :developers ["FIXME: other developers"]})
