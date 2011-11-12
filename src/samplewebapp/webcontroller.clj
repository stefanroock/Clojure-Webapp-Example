(ns samplewebapp.webcontroller
  (:use ring.adapter.jetty)
  (:use ring.middleware.reload)
  (:use ring.middleware.stacktrace)
  (:use samplewebapp.routes)
  (:require [compojure.handler :as handler]))

(def app-auto-reload
	(-> #'main-routes
	    (wrap-reload '(samplewebapp.webcontroller samplewebapp.routes samplewebapp.actions))
	    (wrap-stacktrace)))

(defn boot []
	(handler/api main-routes)
	(run-jetty #'app-auto-reload {:port 8080}))
