## Clonode
Node.js + ClojureScript hello world, built with shadow-cljs. Non functional.

``` sh
$ sc cljs-repl m
shadow-cljs - config: /home/ao/code/clonode/shadow-cljs.edn
shadow-cljs - server version: 2.11.4 running at http://localhost:9630
shadow-cljs - nREPL server started on port 33921
cljs.user=> (ns app.core)
nil
app.core=> (moment)
#object[Moment Sun Oct 04 2020 15:23:08 GMT-0800]
app.core=> (add 4 5)
#object[ReferenceError ReferenceError: module$add is not defined]
app.core=>
```

``` sh
$ node out/core.js
9
true
hi
shadow-cljs - #4 ready!
```
