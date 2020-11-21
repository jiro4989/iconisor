(defproject iconisor "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [cljfx "1.7.10"]]
  :main iconisor.core
  ;:main ^:skip-aot iconisor.core
  :target-path "target/%s"
  :plugins [[lein-jlink "0.3.0"]]
  :middleware [[leiningen.jlink/middleware]]
  :jlink-modules ["javafx.base"
                  "javafx.controls"
                  "javafx.swing"
                  "javafx.graphics"
                  "javafx.fxml"]
  :jlink-module-paths ["./jmods/javafx-jmods-14.0.1"]
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]
                       :prep-tasks ["compile"]
                       :uberjar-name "iconisor.jar"
                       :injections [(javafx.application.Platform/exit)]}})
