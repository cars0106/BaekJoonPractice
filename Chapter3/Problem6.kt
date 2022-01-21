package Chapter3

fun main() {
    var n = readLine()!!.toInt()

    for(i: Int in 0..(n - 1))
        println(n - i)
}