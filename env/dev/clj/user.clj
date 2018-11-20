(ns user
  (:require [henchman.config :refer [env]]
            [clojure.spec.alpha :as s]
            [expound.alpha :as expound]
            [mount.core :as mount]
            [henchman.core :refer [start-app]]))

(alter-var-root #'s/*explain-out* (constantly expound/printer))

(defn start []
  (mount/start-without #'henchman.core/repl-server))

(defn stop []
  (mount/stop-except #'henchman.core/repl-server))

(defn restart []
  (stop)
  (start))


