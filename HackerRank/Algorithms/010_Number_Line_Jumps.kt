import kotlin.io.*
import kotlin.text.*

fun kangarooAlternative3(x1: Int, v1: Int, x2: Int, v2: Int) = when {
    v1 <= v2 -> "NO"
    (x2-x1) % (v2-v1) == 0 -> "YES"
    else -> "NO"
}

fun kangarooAlternative2(x1: Int, v1: Int, x2: Int, v2: Int): String {
    return when {
        v1 <= v2 -> "NO"
        (x2-x1) % (v2-v1) == 0 -> "YES"
        else -> "NO"
    }
}

fun kangarooAlternative(x1: Int, v1: Int, x2: Int, v2: Int): String {
    if (v1 <= v2) return "NO"
    return if ((x2-x1) % (v2-v1) == 0) "YES" else "NO"
}

fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
    if (v1 <= v2) return "NO"
    if ((x2-x1) % (v2-v1) == 0) {
        return "YES"
    } else {
        return "NO"
    }
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val x1 = first_multiple_input[0].toInt()

    val v1 = first_multiple_input[1].toInt()

    val x2 = first_multiple_input[2].toInt()

    val v2 = first_multiple_input[3].toInt()

    val result = kangaroo(x1, v1, x2, v2)

    println(result)
}
