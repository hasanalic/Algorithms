
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val bnm = scan.nextLine().split(" ")

    val b = bnm[0].trim().toInt()

    val n = bnm[1].trim().toInt()

    val m = bnm[2].trim().toInt()

    val keyboards = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val drives = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val moneySpent = getMoneySpent(keyboards, drives, b)

    println(moneySpent)
}

fun getMoneySpent(keyboards: Array<Int>, drives: Array<Int>, b: Int): Int {
    var max = 0
    val min = keyboards.min() + drives.min()

    if (min > b) {
        return -1
    }

    keyboards.forEach { keyboard ->
        drives.forEach { drive ->
            val tempSum = keyboard + drive
            if (tempSum in (max + 1)..b) {
                max = tempSum
            }
        }
    }

    return max
}