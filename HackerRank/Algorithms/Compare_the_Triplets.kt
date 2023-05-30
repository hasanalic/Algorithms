import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    //val arrayOfComparison = Array<Int>(2) {i -> i*0}
    /*
    var pointA = 0
    var pointB = 0
    for(i in 0..2) {
        if(a[i] > b[i]) {
            pointA += 1
        } else if(a[i] < b[i]) {
            pointB += 1
        }
    }
    return arrayOf(pointA, pointB)
    */

    // count'dan sonraki lambda fonksiyonunun içinde yazılan ifade, geriye true ya da false döndürür.
    // geriye true döndükçe point değerleri birer artar
    val pointA = (0..2).count { a[it] > b[it] }
    val pointB = (0..2).count { b[it] > a[it] }
    return arrayOf(pointA, pointB)
}

fun main(args: Array<String>) {

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}
