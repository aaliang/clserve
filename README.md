# clserver

A vertx project that rocks!

## Usage

```lein vertx run```

or

```vertx run core.clj```

## Docker Usage

build the image (java, lein, vertx, clojure deps will automagically be installed):

```docker build -t clserver```
  
run it (it will pull dependencies the first time)

  ```docker run -i -t clserve lein vertx run```

recommend using this as a base image since the above command will wipe out the dependencies and vertx does not seem to support installing dependencies automatically outside of the initial run:

  ```docker commit %IMAGE-ID% my-clserve```

run it again fresh:

  ```docker run -i -t my-clserve lein vertx run```

## License

Copyright © 2014 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
