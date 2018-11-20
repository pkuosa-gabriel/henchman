(ns henchman.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [henchman.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[henchman started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[henchman has shut down successfully]=-"))
   :middleware wrap-dev})
