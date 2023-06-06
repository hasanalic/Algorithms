import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun plusMinusAlternative(arr: Array<Int>): Unit {
    var positive = arr.count { it > 0 }
    var negative = arr.count { it < 0 }
    var zero = arr.count { it == 0 }
    println("${String.format("%.6f",positive/arr.size.toDouble())}\n" +
            "${String.format("%.6f",negative/arr.size.toDouble())}\n" +
            String.format("%.6f",zero/arr.size.toDouble())
    )
}

fun plusMinus(arr: Array<Int>): Unit {
    var positive = 0
    var negative = 0
    var zero = 0
    for (element in arr) {
        if (element>0) positive += 1
        if (element<0) negative += 1
        if (element == 0) zero += 1
    }
    println("${String.format("%.6f",positive/arr.size.toDouble())}\n" +
            "${String.format("%.6f",negative/arr.size.toDouble())}\n" +
            String.format("%.6f",zero/arr.size.toDouble())
    )
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    plusMinus(arr)
}

/*
// "count"
public inline fun <T> Array<out T>.count(predicate: (T) -> Boolean): Int {
    var count = 0
    for (element in this) if (predicate(element)) ++count
    return count
}
 */
