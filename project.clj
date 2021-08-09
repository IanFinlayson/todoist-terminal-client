(defproject todoist-terminal-client "0.1.0-SNAPSHOT"
  :description "Provides a curses-like terminal interface to the Todoist todo list app"
  :url "https://github.com/IanFinlayson/todoist-terminal-client"
  :license {:name "MIT License"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :main ^:skip-aot todoist-terminal-client.interface
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
