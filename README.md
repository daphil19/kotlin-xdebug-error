# kotlin-xdebug-error
A simple example that exemplifies an error when using xdebug.

# Building/running
The error can be produced either on the command line via `./gradlew run` or by opening the project in Intellij.

# Remarks
This was the simplest form that I was able to produce the error. The issue can take different forms. Most forms that I've gotten the error to occur require `Path()` and some number of coroutine-based operations (such as channels, `scope.launch`, and `withContext()`).

It is important to note that the code does not need to be run (as it does in the project here). The error has occurred in situations where a class is simply constructed. The method does not need to be invoked.
