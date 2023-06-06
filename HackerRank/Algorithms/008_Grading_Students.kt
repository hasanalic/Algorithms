import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

fun gradingStudentsAlternative2(grades: Array<Int>) = grades.map {
    when {
        it < 38 -> it
        it % 5 == 3 -> it + 2
        it % 5 == 5 -> it + 1
        else -> it
    }
}.toTypedArray()

fun gradingStudentsAlternative(grades: Array<Int>): Array<Int> {
    return grades.map {
        when {
            it < 38 -> it
            it % 5 == 3 -> it + 2
            it % 5 == 5 -> it + 1
            else -> it
        }
    }.toTypedArray()
}

fun gradingStudents(grades: Array<Int>): Array<Int> {
    for (i in grades.indices) {
        val a = 5 - (grades[i] % 5)
        if (grades[i] > 37 && a < 3) {
            grades[i] += a
        }
    }
    return grades
}

fun main(args: Array<String>) {
    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array<Int>(gradesCount, { 0 })
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}
