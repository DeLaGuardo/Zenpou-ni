(ns Zenpou-ni.views.welcome
  (:require [Zenpou-ni.views.common :as common]
            [noir.content.getting-started])
  (:use [noir.core :only [defpage]]))

(defpage "/welcome" []
         (common/layout
           [:p "Welcome to Zenpou-ni"]))
