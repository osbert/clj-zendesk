(defproject org.clojars.osbert/clj-zendesk "0.3.1"
  :description "Zendesk REST API client for Clojure"
  :url "https://github.com/atroche/clj-zendesk"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-marginalia "0.8.0"]]
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [clj-http "3.12.3"]
                 [inflections "0.13.2"]
                 [com.cemerick/url "0.1.1"]
                 [org.clojure/tools.trace "0.7.8"]
                 [camel-snake-kebab "0.4.2"]
                 [cheshire "5.10.2"]])

