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

        println("Done!") // removing this causes the code to complete without error, but any meaningful statement I've tried here has created the error
    }
}

fun main() {
    XDebugErrorClass()
}