package Chapter3

fun main() {
    var n = readLine()!!.toInt()
    var sum = 0

    for(i: Int in 1..n)
        sum = sum + i

    println(sum)
}