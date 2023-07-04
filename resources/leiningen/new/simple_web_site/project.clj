(defproject {{name}} "0.1.0-SNAPSHOT"

  :description  "FIXME: write description"
  :url          "http://example.com/FIXME"
  :license      {:name "MIT License"
                 :url  "http://opensource.org/licenses/MIT"}

  :dependencies [[aero "1.1.6"]
                 [ch.qos.logback/logback-classic "1.2.12"]
                 [hiccup "1.0.5"]
                 [http-kit "2.7.0"]
                 [javax.servlet/servlet-api "2.5"]
                 [metosin/reitit-core "0.6.0"]
                 [metosin/reitit-dev "0.6.0"]
                 [metosin/reitit-middleware "0.6.0"]
                 [metosin/reitit-schema "0.6.0"]
                 [metosin/reitit-ring "0.6.0"]
                 [metosin/ring-http-response "0.9.3"]
                 [mount "0.1.17"]
                 [net.gered/aging-session "0.2.0"]
                 [nrepl "1.0.0"]
                 [org.clojure/clojure "1.10.3"]
                 [org.clojure/tools.logging "1.2.4"]
                 [org.webjars.npm/mini.css "3.0.1"]
                 [org.webjars/webjars-locator "0.42"]
                 [ring/ring-anti-forgery "1.3.0"]
                 [ring/ring-devel "1.10.0"]
                 [ring-webjars "0.2.0"]]

  :main         {{root-ns}}.core

  :repl-options {:init-ns {{root-ns}}.core}
  :target-path  "target/%s/"

  :profiles     {:dev             {:source-paths   ["env/dev/src"]
                                   :resource-paths ["env/dev/resources"]
                                   :dependencies   [[pjstadig/humane-test-output "0.11.0"]]
                                   :injections     [(require 'pjstadig.humane-test-output)
                                                    (pjstadig.humane-test-output/activate!)]}

                 :release         {:source-paths   ["env/release/src"]
                                   :resource-paths ["env/release/resources"]}

                 :release/uberjar {:omit-source    true
                                   :aot            :all}

                 :uberjar         [:release :release/uberjar]}

  )
