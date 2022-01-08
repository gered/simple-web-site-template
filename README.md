# Leiningen Template: Simple Clojure Web Site

A Leiningen template intended for creating new Clojure web site projects utilizing [reitit](https://github.com/metosin/reitit).
This resulting project will **NOT** include any ClojureScript support at all and instead just features simple 
server-side HTML rendering via [Hiccup](https://github.com/weavejester/hiccup).

I usually have a personal distinction in my head between "web app" and "web site" where the former typically features 
significant amounts of front-end Javascript (in other words, is more likely to be developed in a "single page 
application"-style) while the latter does not, and may not even utilize _any_ Javascript at all. 

This Leiningen template is for the latter! Which I feel is a highly under-utilized form of web development today...

This template primarily exists for my own personal use, so some stuff is definitely more oriented towards my own 
particular preferences regarding setup and organization of a Clojure project.

## Usage

```text
$ lein new net.gered/simple-web-site [your-project-name-here]
```

The resulting project starts up via a `main` function and during startup expects to be able to read an EDN
configuration file located in the current working directory called `config.edn`.

The project can be run simply by:

```text
$ lein run
```

A nREPL server will be started which can be connected to on port 7000 (configured via the aforementioned `config.edn`).

Once running, the web site's root URL should be browsable at http://localhost:8080/ (again, the port can be configured
via the aforementioned `config.edn`).

## License

Copyright © 2022 Gered King

Distributed under the the MIT License. See LICENSE for more details.