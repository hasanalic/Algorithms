import kotlin.io.*
import kotlin.text.*

fun timeConversionAlternative(s: String): String {
    var hour = s.take(2).toInt()
    var amPm = s.takeLast(2)
    val middle = s.substring(2,8) // start index (2) -> inclusive(dahil), end index (8) -> exclusive(dahil değil)

    if (amPm == "AM" && hour == 12) {
        hour = 0
    }
    if (amPm == "PM" && hour < 12) {
        hour += 12
    }
    val hourStr = hour.toString().padStart(2,'0')
    return hourStr + middle
}

fun timeConversion(s: String): String {
    val hourString = s.take(2)
    if (s.endsWith("PM") && hourString != "12") {
        val a = hourString.toInt() + 12
        return s.replace(hourString,a.toString()).dropLast(2)
    }
    if (s.endsWith("AM") && hourString == "12") {
        return s.replace(hourString,"00").dropLast(2)
    }
    return s.dropLast(2)
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}
