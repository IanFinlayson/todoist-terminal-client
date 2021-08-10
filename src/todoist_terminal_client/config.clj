(ns todoist-terminal-client.config)

(defn config-file-name
  "Returns the path to the app's config file in the user's home directory"
  []
  (str (System/getProperty "user.home") "/.config/todo-config.clj"))

; the default settings written to the file
(def default-settings
  {:select-color "blue"
   :sort "normal"
  })

(defn dump-default-settings
  "Writes the default settings (given token and default list) to file"
  [token default-list]
  (let [full-default-settings
        (conj {:token token :default-list default-list} default-settings)]
    (with-open [outfile (clojure.java.io/writer (config-file-name))]
      (doseq [setting full-default-settings]
        (.write outfile (str setting "\n"))))))




    
    
    ;(spit (config-file-name) full-default-settings)))
  


