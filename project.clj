(defproject ravencoin-rpc "0.1.0-SNAPSHOT"
  :description "Clojure Ravencoin RPC client"
  :url "https://www.ravencoin.org"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [clj-http "3.10.0"]
                 [cheshire "5.9.0"]]
  :repl-options {:init-ns ravencoin-rpc.core})
