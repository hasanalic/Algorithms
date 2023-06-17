import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun migratoryBirdsAlternative(arr: Array<Int>): Int {
    val counts = arrayOf(0,0,0,0,0,0)
    arr.forEach {
        counts[it] += 1
    }
    var maxIndex = 0
    var max = 0
    for ((i, count) in counts.withIndex()) {
        if (count > max) {
            max = count
            maxIndex = i
        }
    }
    return maxIndex
}

fun migratoryBirds(arr: Array<Int>): Int {
    val array = arrayOf(arr[0], 0)
    var counter = 0
    for (element in arr) {
        for (item in arr) {
            if (element == item) {
                counter += 1
            }
        }
        if (counter > array[1]) {
            array[0] = element
            array[1] = counter
        }
        counter = 0
    }
    return array[0]
}

fun main(args: Array<String>) {
    val arrCount = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = migratoryBirds(arr)

    println(result)
}
