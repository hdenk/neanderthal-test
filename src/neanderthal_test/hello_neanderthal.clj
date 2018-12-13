(ns neanderthal-test.hello-neanderthal
  (:require [uncomplicate.neanderthal.core :refer :all]
            [uncomplicate.neanderthal.native :refer :all]))

;; We create two matrices...
(def A (dge 2 3 [1 2 3 4 5 6]))
(def B (dge 3 2 [1 3 5 7 9 11]))

;; ... and multiply them
(mm A B)

;; If you see something like this:
;; #RealGEMatrix[double, mxn:2x2, layout:column, offset:0]
;; ▥       ↓       ↓       ┓
;; →       35.0    89.0
;; →       44.0   116.0
;; ┗                       ┛
;; It means that everything is set up and you can enjoy programming with Neanderthal :)
