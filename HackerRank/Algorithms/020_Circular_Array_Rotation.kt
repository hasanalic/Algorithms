
fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val k = first_multiple_input[1].toInt()

    val q = first_multiple_input[2].toInt()

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val queries = Array<Int>(q, { 0 })
    for (i in 0 until q) {
        val queriesItem = readLine()!!.trim().toInt()
        queries[i] = queriesItem
    }

    val result = circularArrayRotation(a, k, queries)

    println(result.joinToString("\n"))
}

fun circularArrayRotation(a: Array<Int>, k: Int, queries: Array<Int>): Array<Int> {
    val size = a.size

    val processedArray = Array<Int>(size) {0}

    for (i in a.indices) {
        val newIndex = (i + k) % size
        processedArray[newIndex] = a[i]
    }

    val result = mutableListOf<Int>()

    queries.forEach {
        result.add(processedArray[it])
    }

    return result.toTypedArray()
}