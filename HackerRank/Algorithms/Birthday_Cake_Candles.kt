import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun birthdayCakeCandlesAlternative(candles: Array<Int>): Int {
    val max = candles.max()
    return candles.count { it == max }
}

fun birthdayCakeCandles(candles: Array<Int>): Int {
    var max = candles[0]
    var counter = 0
    for (element in candles) {
        if (element > max) {
            max = element
            counter = 1
        } else if (element == max) {
            counter = +1
        }
    }
    return counter
}

fun main(args: Array<String>) {
    val candlesCount = readLine()!!.trim().toInt()

    val candles = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = birthdayCakeCandles(candles)

    println(result)
}