(ns app.core
  (:require [moment]
            ["/add" :as add]
            ))

(println (add 4 5))

(defn main []
  (println "hi"))

(println (fn? add))
;; (->
;;    (moment)
;;    (.add 1 "days")
;;    (.calendar))
;; (defn main [] (println (fun) "<<<---"));; ;; ADDED
;; (println (add ( 4 5)))
;; (moment)
;; (defn average [a b]
;;   (/ (+ a b) 2.0))
