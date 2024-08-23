
fun main(args: Array<String>) {
    val steps = readLine()!!.trim().toInt()

    val path = readLine()!!

    val result = countingValleys(steps, path)

    println(result)
}

fun countingValleys(steps: Int, path: String): Int {
    var valleyCount = 0

    var hikerLevel = 0

    path.forEach { step ->
        if (step == 'D') {
            hikerLevel -= 1
        } else {
            hikerLevel += 1
            if (hikerLevel == 0) valleyCount += 1
        }
    }

    return valleyCount
}