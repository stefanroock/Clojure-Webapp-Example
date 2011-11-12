(ns samplewebapp.mainheroku
  (:use ring.adapter.jetty)
  (:use samplewebapp.routes)
  (:require [compojure.handler :as handler]))
; Ring provides that adapter to Jetty and the underlying HTTP requests and responses.
; Difference to main-local.clj is that automatic reloading and browser stacktrace is not available under Heroku.

(def app-heroku
	(-> #'main-routes ; use the routes defined in main-routes 
	    (handler/api)))  ; neccessary to access the form data in the paramter style way in the route definitions

(defn app [req]
  {:status 200
   :headers {"Content-Type" "text/plain"}
   :body "Hello from Clojure!\n"})

(defn -main []
  (let [port (Integer/parseInt (System/getenv "PORT"))]
    (run-jetty app-heroku {:port port}))) ; run on Heroku
