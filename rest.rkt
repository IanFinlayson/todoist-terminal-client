; rest.rkt
; functions to interact with the Todoist REST API

(require net/url)
(require net/http-easy)

; this URL is used for all of the Todoist API calls
(define URL "https://api.todoist.com/rest/v1/")

(define (get-projects token)
  ; make the call and get the response
  (let ([response (get (string-append URL "projects")
    #:headers (hash 'Authorization token))])
   (displayln (response-body response))))

