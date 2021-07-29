; interface.rkt
; provides a command-line interface for users to
; interact with their projects and tasks

(require racket/include)
(include "rest.rkt")

; loads the token from the token.txt file
; this is needed to authenticate REST calls with Todoist
(define (load-token)
  (let ([file (open-input-file "token.txt")])
    (string-append "Bearer " (symbol->string (read file)))))



(get-projects (load-token))


