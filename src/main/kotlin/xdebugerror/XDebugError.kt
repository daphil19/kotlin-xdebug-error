package xdebugerror

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import kotlin.io.path.Path

fun main() = runBlocking {
    Path("/tmp")

    withContext(Dispatchers.IO) {
        println("hello world!")
    }
}