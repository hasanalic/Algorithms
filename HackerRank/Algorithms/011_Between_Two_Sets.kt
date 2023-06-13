import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun getTotalXAlternative(a: Array<Int>, b: Array<Int>): Int {
    val start = a.max()!!
    val end = b.min()!!

    return (start..end).count { num ->
        a.all { num % it == 0 } && b.all { it % num == 0 }
    }
}

fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    var count = 0
    for (element in a.last()..b.first()) {
        var control = true
        a.forEach {
            if (element % it != 0) {
                control = false
            }
        }
        b.forEach {
            if (it % element != 0) {
                control = false
            }
        }
        if (control) {
            count += 1
        }
    }
    return count
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val m = first_multiple_input[1].toInt()

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val brr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val total = getTotalX(arr, brr)

    println(total)
}
