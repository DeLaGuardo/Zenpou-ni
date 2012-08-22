; (ns Zenpou-ni.server
;   (:require [noir.server :as server])
;   (:use [aleph.http]))

; (server/load-views-ns 'Zenpou-ni.views)

; (defn -main [& m]
;   (let [mode (keyword (or (first m) :dev))
;         port (Integer. (get (System/getenv) "PORT" "8080"))]
;     (server/start port {:mode mode
;                         :ns 'Zenpou-ni})))

(ns Zenpou-ni.server
  (:use aleph.http
        noir.core
        lamina.core)
  (:require
    [noir.server :as nr-server] ))

(nr-server/load-views "src/Zenpou-ni/views/")

(defn -main [& m]
  (let [mode (keyword (or (first m) :dev))
        port (Integer. (get (System/getenv) "PORT" "3009"))
        noir-handler (nr-server/gen-handler {:mode mode})]
    (start-http-server
      (wrap-ring-handler noir-handler)
      {:port port :websocket true})))