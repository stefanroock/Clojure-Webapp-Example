(ns samplewebapp.webcontroller
  (:use ring.adapter.jetty)
  (:use ring.middleware.stacktrace)
  (:use samplewebapp.routes)
  (:require [compojure.handler :as handler]))
; Ring provides that adapter to Jetty and the underlying HTTP requests and responses.
; Difference to main-local.clj is that automatic reloading is not available under Heroku.

(def app-heroku
	(-> #'main-routes ; use the routes defined in main-routes 
	    (handler/api)  ; neccessary to access the form data in the paramter style way in the route definitions
	    (wrap-stacktrace))) ; show stacktrace in browser when exceptions are thrown in the server

(defn -main []
  (let [port (Integer/parseInt (System/getenv "PORT"))]
    (run-jetty app-heroku {:port port}))) ; run on Heroku
