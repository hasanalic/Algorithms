import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun breakingRecords(scores: Array<Int>): Array<Int> {
    var bestRecordCount = 0
    var worstRecordCount = 0
    var bestRecord = scores.first()
    var worstRecord = bestRecord
    scores.forEach {
        if (it>bestRecord) {
            bestRecord = it
            bestRecordCount += 1
        }
        if (it<worstRecord) {
            worstRecord = it
            worstRecordCount += 1
        }
    }
    return arrayOf(bestRecordCount,worstRecordCount)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val scores = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}
