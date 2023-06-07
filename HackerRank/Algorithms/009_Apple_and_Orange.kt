import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun countApplesAndOrangesAlternative(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Unit {
    println(apples.count { it + a in s..t})
    println(oranges.count { it + b  in s..t})
}

fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Unit {
    var countApples: Int = 0
    var countOranges: Int = 0
    for (apple in apples) {
        if ((apple + a) in s..t) {
            countApples += 1
        }
    }
    for (orange in oranges) {
        if ((orange + b) in s..t) {
            countOranges += 1
        }
    }
    print("$countApples\n$countOranges")
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val s = first_multiple_input[0].toInt()
    val t = first_multiple_input[1].toInt()

    val second_multiple_input = readLine()!!.trimEnd().split(" ")

    val a = second_multiple_input[0].toInt()
    val b = second_multiple_input[1].toInt()

    val third_multiple_input = readLine()!!.trimEnd().split(" ")

    val m = third_multiple_input[0].toInt()
    val n = third_multiple_input[1].toInt()

    val apples = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val oranges = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    countApplesAndOranges(s, t, a, b, apples, oranges)
}
