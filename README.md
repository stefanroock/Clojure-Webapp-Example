A simple Clojure webapp that shows how to use Jetty, Ring, Compojure and Hiccup to build a web application.

The goal of the example code is to make it easy to start with your first web application with Clojure.

Get Started
-----------
* lein deps
* lein repl
* (use 'samplewebapp.main-local)
* (boot)
* export PORT=8080 (the app reads this in from the environment).
* Open http://localhost:8080 in your web browser: you should see a welcome message. For other URLs to try take a look into routes.clj.

Run on Heroku
-------------
First create a new app at Heroku with the cedar stack: heroku create --stack cedar <my-app-name>

To run the webapp with Heroku we need the Procfile file and main-heroku.clj.

Here is a description of how to run Clojure apps on Heroku: http://blog.heroku.com/archives/2011/7/5/clojure_on_heroku/

Customize it !
--------------
(Optional - replace the "samplewebapp" strings with your web app's name). 
find . -type f -print0 | xargs -0 sed -i 's/samplewebapp/myAppName/g'


License
-------
This program is free software. It comes without any warranty, to the extent permitted by applicable law. You can redistribute it and/or modify it under the terms of the Do What The Fuck You Want To Public License, Version 2, as published by Sam Hocevar. See http://sam.zoy.org/wtfpl/COPYING for more details.
