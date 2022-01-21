package Chapter3

fun main() {
    var n = readLine()!!.toInt()

    for(i: Int in 1..9)
        println("$n * $i = ${n * i}")
}