package xdebugerror

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.withContext
import kotlin.io.path.Path

class XDebugErrorClass {

    private val channel = Channel<String>()

    suspend fun doThing() {
        Path("/tmp")

        channel.send("HI")

        withContext(Dispatchers.IO) {
            println("hello world!")
        }
    }
}

fun main() {
    XDebugErrorClass()
}