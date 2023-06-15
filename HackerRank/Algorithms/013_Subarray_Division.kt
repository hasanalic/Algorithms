import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

// Expression Body
fun birthdayAlternative4(s: Array<Int>, d: Int, m: Int): Int = (0..s.size - m).count {
    s.copyOfRange(it, it + m).sum() == d
}

fun birthdayAlternative3(s: Array<Int>, d: Int, m: Int): Int {
    return (0..s.size - m).count {
        s.copyOfRange(it, it + m).sum() == d
    }
}

fun birthdayAlternative2(s: Array<Int>, d: Int, m: Int): Int {
    var counter = 0
    for (start in 0..s.size - m) {
        if (s.copyOfRange(start, start + m).sum() == d) {
            counter += 1
        }
    }
    return counter
}

fun birthdayAlternative(s: Array<Int>, d: Int, m: Int): Int {
    var sum = 0
    var count = 0
    for (i in 0..s.size-m) {
        for (j in i until i + m) {
            sum += s[j]
        }
        if (sum == d) count += 1
        sum = 0
    }
    return count
}

fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    var sum = 0
    var count = 0
    for (i in s.indices) {
        for (j in i until i + m) {
            if (j < s.size) {
                sum += s[j]
            }
        }
        if (sum == d) count += 1
        sum = 0
    }
    return count
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val s = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val d = first_multiple_input[0].toInt()

    val m = first_multiple_input[1].toInt()

    val result = birthday(s, d, m)

    println(result)
}
