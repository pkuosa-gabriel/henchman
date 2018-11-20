(ns henchman.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[henchman started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[henchman has shut down successfully]=-"))
   :middleware identity})
