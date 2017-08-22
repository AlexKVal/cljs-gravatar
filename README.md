# cljs-gravatar

This ClojureScript library uses Google Closure's MD5 class to generate Gravatar URLs.

## Usage

[![Clojars Project](http://clojars.org/cljs-gravatar/latest-version.svg)](https://clojars.org/cljs-gravatar)


```clojure
(ns your-ns.core
  (:require [cljs-gravatar.core :as gravatar]))

(enable-console-print!)

(println (gravatar/url "example@email.com"))
; https://secure.gravatar.com/avatar/8455938a1db5c475a87d76edacb6284e
(println (gravatar/url "eXaMpLe@EMAIL.com"))
; https://secure.gravatar.com/avatar/8455938a1db5c475a87d76edacb6284e
(println (gravatar/url "example@email.com" :size 50))
; https://secure.gravatar.com/avatar/8455938a1db5c475a87d76edacb6284e?s=50
(println (gravatar/url "example@email.com" :rating :pg :default :retro))
; https://secure.gravatar.com/avatar/8455938a1db5c475a87d76edacb6284e?r=pg&d=retro
```

## Testing

```
> brew install phantomjs
> lein doo
```

## License

Copyright © 2017 [Alexander Shemetovsky](https://github.com/alexkval)

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
