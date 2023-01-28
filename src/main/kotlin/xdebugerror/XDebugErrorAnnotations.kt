import kotlin.coroutines.suspendCoroutine

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
inline fun f(a: Int): Int = a

fun main() {
    suspend {
        f(0)
        suspendCoroutine<Unit> {}
    }
}