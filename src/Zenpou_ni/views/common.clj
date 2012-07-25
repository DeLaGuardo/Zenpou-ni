(ns Zenpou-ni.views.common
  (:use [noir.core :only [defpartial]]
        [hiccup.page :only [include-css include-js html5]]))

(defpartial layout [& content]
            (html5
              [:head
               [:title "Zenpou-ni"]
               ; (include-css "/css/reset.css")
               (include-css "/bootstrap/css/bootstrap.css")
               (include-js "http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js")]
              [:body
               [:div#wrapper {}
                content]
               (include-js  "/highcharts/js/highcharts.js"
                            "/highcharts/js/modules/exporting.js")]))
