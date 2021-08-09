(ns todoist-terminal-client.interface
  (:require 
    [todoist-terminal-client.webapi :as webapi]
    [todoist-terminal-client.config :as config])
  (:gen-class))


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!" (config/get-token)))

(defn hi [] (println "HI"))

