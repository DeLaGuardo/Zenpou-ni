(ns Zenpou-ni.views.welcome-async
  (:require [Zenpou-ni.views.common :as common]
            [cheshire.core :as json])
  (:use noir-async.core))

(defpage-async "/echo" [] conn
  (on-receive conn (fn [m] (async-push conn ))))

(defpage-async "/always-chunky" [] conn
  ;; Sending the header explicitly indicates a chunked response
  (async-push conn {:status 200 :chunked true})
  (async-push conn "chunk one")
  (async-push conn "chunk two")
  (close-connection conn))