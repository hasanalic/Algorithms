
fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)

    println(result)
}

fun sockMerchant(n: Int, ar: Array<Int>): Int {
    var count = 0
    val pairedSockList = mutableListOf<Int>()

    ar.forEach {
        if (pairedSockList.contains(it)) {
            pairedSockList.remove(it)
            count += 1
        } else {
            pairedSockList.add(it)
        }
    }

    return count
}