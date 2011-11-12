(ns samplewebapp.actions
  (:use hiccup.core)
  (:use hiccup.form-helpers))

(defn layout [title & body]
	  (html
	    [:head [:title title]]
	    [:body [:h1.header title] body])) 

(defn full-name [first second]
	(layout "Full Name" (str first " " second)))

(defn name-form []
	(layout (form-to [:post "/post-name"]
	  (label :first-name "First Name") (text-field :first-name) [:br] (label :second-name "Second Name") (text-field :second-name) 
	  [:p (submit-button "Submit")])))
	
(defn post-name [first second]
	(full-name first second))
