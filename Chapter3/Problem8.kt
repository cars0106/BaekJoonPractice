package Chapter3

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    var t = scanner.next().toInt()

    for(i: Int in 0..(t-1)) {
        var a = scanner.next().toInt()
        var b = scanner.next().toInt()
        println("Case #${i+1}: $a + $b = ${a+b}")
    }
}