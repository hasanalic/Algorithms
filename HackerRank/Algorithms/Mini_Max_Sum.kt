import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun miniMaxSumAlternative(arr: Array<Int>): Unit {
    var min = arr.min()
    var max = arr.max()
    var sum = arr.sumOf { it.toLong() }
    //var sum = arr.map { it.toLong() }.sum()
    print("${sum-max} ${sum-min}")
}

fun miniMaxSum(arr: Array<Int>): Unit {
    var min = arr[0]
    var max = arr[0]
    var sum: Long = 0
    for (element in arr) {
        sum += element
        if(min > element) {
            min = element
        }
        if(max < element) {
            max = element
        }
    }
    print("${sum-max} ${sum-min}")
}

fun main(args: Array<String>) {

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    miniMaxSum(arr)
}