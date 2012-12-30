(ns one-man-wiki.views
  (:use [hiccup.core :only [html5]]
        [hiccup.form :only [text-area submit-button]]))

(defn view-page [name content]
  (html5
   [:head
    [:title (format "Viewing: %s" name)]]
   [:body
    [:pre content]]))

(defn edit-page [name content]
  (html5
   [:head
    [:title (format "Editing: %s" name)]]
   [:body
    [:form
     (text-area "content" content)
     (submit-button "Save page")]]))