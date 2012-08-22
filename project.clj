(defproject Zenpou-ni "0.1.0-SNAPSHOT"
            :description "FIXME: write this!"
            :dependencies [[org.clojure/clojure "1.4.0"]
                           [noir "1.3.0-beta3"]
                           [com.novemberain/monger "1.1.1"]
                           [org.clojars.tavisrudd/redis-clojure "1.3.1"]
                           [noir-async "1.1.0-beta7"]
                           [cheshire "2.0.4"]]
            :dev-dependencies [[lein-dieter-precompile "0.1"]]
            :plugins [[lein-lesscss "1.2"]]
            :lesscss-paths ["less" "resources/public/bootstrap/less"]
            :lesscss-output-path "resources/public/css"
            :main Zenpou-ni.server)

