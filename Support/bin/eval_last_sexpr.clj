#!/usr/bin/env cake
(in-ns 'textmate)
(clojure.core/refer 'clojure.core)
(require '[clojure.java.io :as io])
(load-file (str (io/file (bake/*env* "TM_BUNDLE_SUPPORT") "utils.clj")))

(defn do-stuff []
	(inc 1)) 


(println
 (str
    "<pre>"
    (eval-in-file-ns (clojure.core/eval (get-last-sexpr)))
    "</pre>"))