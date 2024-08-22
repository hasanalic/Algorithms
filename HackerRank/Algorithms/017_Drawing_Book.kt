
fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val p = readLine()!!.trim().toInt()

    val result = pageCount(n, p)

    println(result)
}

fun pageCount(n: Int, p: Int): Int {
    val pairCount = n / 2
    var min = 0

    if (p % 2 == 0) {
        min = p / 2
    } else {
        min = (p-1) / 2
    }

    return if ((pairCount - min) < min) {
        pairCount - min
    } else {
        min
    }
}