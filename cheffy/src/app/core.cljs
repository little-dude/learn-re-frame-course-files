(ns app.core
  (:require [reagent.core :as r]
            ["@smooth-ui/core-sc" :refer [Normalize Button ThemeProvider]]
            [app.theme :refer [cheffy-theme]]))

(defn app
  []
  [:<>
   [:> Normalize]
   [:> ThemeProvider {:theme cheffy-theme}
    [:> Button {:variant "info"} "Hello"]]])

(defn ^:dev/after-load start
  []
  (r/render [app]
    (.getElementById js/document "app")))

(defn ^:export init
  []
  (start))
