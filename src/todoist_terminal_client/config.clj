(ns todoist-terminal-client.config)

(defn config-file-name
  "Returns the path to the app's config file in the user's home directory"
  []
  (str (System/getProperty "user.home") "/.config/todo-config.clj"))

; the default settings written to the file
(def default-settings
  {:sort "normal"
   :select-color "blue"
  })

(defn dump-default-settings
  "Writes the default settings (given token and default list) to config file"
  [token default-list]
  (let [full-default-settings
        (conj {:token token :default-list default-list} default-settings)]
    (with-open [outfile (clojure.java.io/writer (config-file-name))]
      (.write outfile "; settings file for todoist terminal client\n{\n")
      (doseq [setting full-default-settings]
        (.write outfile
                (str "  " (first setting) " \"" (second setting) "\"\n")))
      (.write outfile "}\n"))))


; TODO
(defn get-token [] "123456")

; from https://squirrel.pl/blog/2012/10/01/configuration-files-in-clojure/
;(defn load-config [filename]
  ;(with-open [r (io/reader filename)]
    ;(read (java.io.PushbackReader. r))))


