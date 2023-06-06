import kotlin.collections.*
import kotlin.io.*
import kotlin.math.abs
import kotlin.text.*

fun diagonalDifferenceAlternative2(arr: Array<Array<Int>>): Int {
    val n = arr.size
    var d1 = 0
    var d2 = 0
    for (i in 0 until n) {
        d1 += arr[i][i]
        d2 += arr[i][n-i-1]
    }
    return abs(d1 - d2)
}

fun diagonalDifferenceAlternative(arr: Array<Array<Int>>): Int {
    val n = arr.size
    var d1 = (0 until n).sumOf { arr[it][it] }
    var d2 = (0 until n).sumOf { arr[it][n - it - 1] }
    return abs(d1 - d2)
}

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var primaryDiag = 0
    var secondryDiag = 0
    for (i in arr.indices) {
        for (j in arr.indices) {
            if (i == j) {
                primaryDiag += arr[i][j]
                secondryDiag += arr[arr.lastIndex - i][j]
            }
        }
    }
    return abs(primaryDiag - secondryDiag)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}

// Array of Array (2 boyutlu dizi/matris oluşturma)
val array = arrayOf(
    arrayOf(1, 2, 3),
    arrayOf(4, 5, 6),
    arrayOf(9, 8, 9)
)
