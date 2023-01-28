# kotlin-xdebug-error
A simple example that exemplifies an error when using `-XDebug`.

# Building/running
The error can be produced either on the command line via `./gradlew run` or by opening the project in Intellij.

# Files
There are a couple of files in this project, each demonstrating a way to get the error to occur.

`XDebugError` shows the initial minimum reproducible example of the error found.

`XDebugErrorClass` is an example of how to get the error to occur in a class during class construction time.

`XDebugErrorAnnotation` is another minimum reproducible example that identifies the potential impact of the annotation(s) on `Path()`. Thanks to @ephemient in the [kotlin slack](https://kotlinlang.slack.com) for producing this example.

# Remarks
This was the simplest form that I was able to produce the error. The issue can take different forms. Most forms that I've gotten the error to occur require `Path()` and some number of coroutine-based operations (such as channels, `scope.launch`, and `withContext()`).

It is important to note that the code does not need to be run (as it does in the project here). The error has occurred in situations where a class is simply constructed. The method does not need to be invoked.
