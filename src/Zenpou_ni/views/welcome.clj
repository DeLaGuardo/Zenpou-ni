(ns Zenpou-ni.views.welcome
  (:require [Zenpou-ni.views.common :as common]
            [Zenpou-ni.helpers.jsloader :as js-loader]
            [noir.content.getting-started])
  (:use [noir.core :only [defpage]]))

(defpage "/welcome" []
         (common/layout
            [:h1 "Welcome to Zenpou-ni"]
            [:section {:style "margin-top: 50px"}
              [:form {:class "well form-inline"}
                [:input {:type "text" :class "input-small" :placeholder "Email"}]
                [:input {:type "password" :class "input-small" :placeholder "Password"}]
                [:label {:class "checkbox"}
                  [:input {:type "checkbox"} "Remember me!"]]
                [:button {:class "btn" :type "submit"} "Sign in, now!"]]]
            [:script {:type "text/javascript"} (js-loader/plot-pie)]
            [:div#container {:style "min-width: 400px; height: 400px; margin: 0 auto"}]))
