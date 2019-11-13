(ns ravencoin-rpc.core
  (:require [ravencoin-rpc.client :refer [perform map->Client]]))


(defn client
  [{:keys [url user pass]}]
  (map->Client
    {:url  url
     :user user
     :pass pass}))

(defn get-block-chain-info
  [client]
  (perform client "getblockchaininfo" nil))

(defn generate
  [client {:as params :keys [nblocks maxtries]}]
  (perform client "generate" params))

(defn get-balance
  ([client]
   (get-balance client {}))
  ([client {:as params :keys [dummy minconf include_watchonly]}]
   (perform client "getbalance" params)))
