(defproject Clojure-Webapp-Example "1.0.0-SNAPSHOT"
  :description "A simple Clojure webapp that shows how to use Jetty, Ring, Compojure and Hiccup to build a web application."
  :dependencies [[org.clojure/clojure "1.2.1"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [ring/ring-core "1.0.0-RC1"]
                 [ring/ring-jetty-adapter "0.3.9"]
                 [compojure "0.6.4"]
                 [hiccup "0.3.7"]]
  :dev-dependencies
								 [[ring/ring-devel "0.2.3"]])
