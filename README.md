# ravencoin

[rpc-doc]:https://ravencoin.org/en/developer-reference#rpcs

ravencoin Core provides a remote procedure call ([RPC](rpc-doc)) interface for various administrative tasks, wallet operations, and queries about network and block chain data.

This library implements RPC interface over http post request.

## Installation

Add `[ravencoin-rpc "0.1.0"]` to your dependencies.

## Usage

```clojure
(require '[ravencoin-rpc.core :as rvn])

(def client
  (rvn/client
    {:url  "http://127.0.0.1:18766"
     :user "ravencoin"
     :pass "local321"}))

(rvn/get-block-chain-info client)

;;=>
;;{:pruned false,
;; :difficulty_algorithm "DGW-180",
;; :bip9_softforks {:assets {:status "active", :startTime 0, :timeout 999999999999, :since 432},
;;                  :messaging_restricted {:status "active", :startTime 0, :timeout 999999999999, :since 432}},
;; :difficulty 4.656542373906925E-10,
;; :size_on_disk 157307,
;; :bestblockhash "1c5c3761bded0f0793d9071b2c23a0e2ad4dcd1cf1098636eae0a127a329524b",
;; :verificationprogress 1,
;; :warnings "",
;; :headers 501,
;; :softforks [],
;; :chainwork "00000000000000000000000000000000000000000000000000000000000003ec",
;; :chain "regtest",
;; :blocks 501,
;; :mediantime 1573595163}

(rvn/generate client {:nblocks 100})

;;=>
;;["7d30ecb13fe24f5214513643843caa0a506bd0df0f876dc37e7f659c6d3899b1"
 ;;"5c3b789b6a8b19c60976e1199aca5cee9a72930ba8d6becaf3e8ee1aac0750be"
;; ...]

(rvn/get-balance client)

;; => 1339500.0
```

## License

[homepage]:http://twitter.com/olimsaidov

Copyright © 2019 [Olim Saidov][homepage].

Distributed under the Eclipse Public License version 1.0