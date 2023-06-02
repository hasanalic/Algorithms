import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

fun staircaseAlternative3(n: Int) = (1..n).forEach {
    println(" ".repeat(n-it) + "#".repeat(it))
}

fun staircaseAlternative2(n: Int): Unit {
    for (i in 1..n) {
        val line = " ".repeat(n-i) + "#".repeat(i)
        println(line)
    }
}

fun staircaseAlternative(n: Int): Unit {
    for (i in 1..n) {
        repeat(n-i) { print(" ") }
        repeat(i) { print("#") }
        println()
    }
}

fun staircase(n: Int): Unit {
    for (i in 0 until n) {
        for (j in n-2 downTo i) {
            print(" ")
        }
        for (j in 0..i) {
            print("#")
        }
        println()
    }
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    staircase(n)
}