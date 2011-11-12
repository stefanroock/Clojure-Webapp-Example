A simple Clojure webapp that shows how to use Jetty, Ring, Compojure and Hiccup to build a web application.

The goal of the example code is to make it easy to start with your first web application with Clojure.

Get Started
-----------
* lein deps
* lein repl
* (use 'samplewebbapp.webcontroller)
* (boot)
* Open http://localhost:8080 in your web browser: you should see a welcome message. For other URLs to try take a look into routes.clj

Run on Heroku
-------------
To run the webapp with Heroku we need the Procfile file and the main method in webcontroller.clj.

License
-------
This program is free software. It comes without any warranty, to
the extent permitted by applicable law. You can redistribute it
and/or modify it under the terms of the Do What The Fuck You Want
To Public License, Version 2, as published by Sam Hocevar. See
http://sam.zoy.org/wtfpl/COPYING for more details.