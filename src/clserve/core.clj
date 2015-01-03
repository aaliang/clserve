(ns clserve.core
  (:require [vertx.repl :as repl]
            [vertx.core :as core]
            [vertx.http :as http]))

(def repl-server-id (atom nil))

(defn- req-handler [req]
  (println "Got request:" (.uri req))
  (println "Headers are:" (pr-str (http/headers req)))
  (-> (http/server-response req)
    (http/add-header "Content-Type" "text/html; charset=UTF-8")
    (http/end "<html><body><h1>Hello from vert.x!</h1></body></html>")))

(defn start-http-server []
  (-> (http/server)
    (http/on-request req-handler)
    (http/listen 8080 "localhost")))

(defn stop-repl-server [] (repl/stop @repl-server-id))

;if run as vertx run core.cls
(defn init []
  (start-http-server))

;entry point if lein vertx run
(defn -main []
  (start-http-server))

(reset! repl-server-id (repl/start))

; a couple of different entry points here, they essentially do the same thing
; on server start