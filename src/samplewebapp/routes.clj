(ns samplewebapp.routes
  (:use compojure.core) 
  (:use samplewebapp.actions)
  (:require [compojure.route :as route]))
; Compojure provides an easy to use DSL for route definitions (on top of Ring)

(defroutes main-routes
   (GET "/" [] "<h1>Sample Clojure Webapp</h1>")
   (GET "/name-form" [] (name-form)) ; simple GET request that returns a web page with a form
   (GET "/full-name/:first/:second" [first second] (full-name first second)) ; GET request with variable URL
   (POST "/post-name" [first-name second-name] (post-name first-name second-name)) ; POST request with form data
   (route/not-found "<h1>Page not found</h1>")) ; unknown URL
