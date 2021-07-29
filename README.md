# todoist-terminal-client
A terminal client for the Todoist todo list app

# Dependencies:
 - https://docs.racket-lang.org/http-easy/

# Installation:
0. Install Racket if you have not already: https://download.racket-lang.org/
1. Install http-easy with `raco pkg install http-easy`
2. Download the code: https://github.com/IanFinlayson/todoist-terminal-client/archive/refs/heads/main.zip
3. Unzip the archive some place that you like
4. Find your todoist token here: https://todoist.com/prefs/integrations (under
   the heading "API token") and copy it into a file called "token.txt" in the
   todoist-terminal-client directory.
5. Open the file called "todo" and change the "cd" command so that it changes
   into the directory of the todoist-terminal-client where you placed it.
6. Make sure "todo" has executable permissions and add it to your PATH.
7. Now running the "todo" command should pull up your todo list :)


