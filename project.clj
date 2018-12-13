(defproject neanderthal-test "0.1.0-SNAPSHOT"
  :description "Checking out Linear-Algebra using Clojure"
  :author "nuryokusan"
  :url "http://github.com/nuryokusan/neanderthal-test"
  :scm {:name "git"
        :url "https://github.com/nuryokusan/neanderthal-test"}
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.9.0"]
                 [uncomplicate/neanderthal "0.20.4"]
                 [uncomplicate/fluokitten "0.9.0"]
                 [prismatic/hiphip "0.2.1"] 
                 [eftest "0.5.3"]
                 [criterium "0.4.4"]]
  :exclusions [[org.jcuda/jcuda-natives :classifier "apple-x86_64"]
               [org.jcuda/jcublas-natives :classifier "apple-x86_64"]]

  ;:plugins [[lein-gorilla "0.4.1-SNAPSHOT"]]
  :plugins [[org.clojars.benfb/lein-gorilla "0.5.3"]]

  :profiles {:dev {:dependencies []
                   :plugins []
                   :global-vars {*warn-on-reflection* true
                                 *unchecked-math* :warn-on-boxed
                                 *print-length* 16}}}

  :javac-options ["-target" "1.8" "-source" "1.8" "-Xlint:-options"]
  ;;:resource-paths ["public"]
  ;:target-path "target/%s"
  ;:test-paths ["test"]
  :source-paths ["src"])
