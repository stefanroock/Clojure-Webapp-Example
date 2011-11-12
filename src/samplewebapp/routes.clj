(ns samplewebapp.routes
  (:use compojure.core)
  (:use samplewebapp.actions)
  (:require [compojure.route :as route]))

(defroutes main-routes
   (GET "/" [] "<h1>Sample Clojure Webapp</h1>")
   (GET "/full-name/:first/:second" [first second] (full-name first second))
   (GET "/name-form" [] (name-form))
   (POST "/post-name" [] (post-name "Foo" "Bar"))
   (route/not-found "<h1>Page not found</h1>"))
