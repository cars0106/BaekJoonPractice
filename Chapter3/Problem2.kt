package Chapter3

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    var t = scanner.next().toInt()
    var array = Array<Int>(t, {0})

    for(i: Int in 0..(t-1)) {
        var a = scanner.next().toInt()
        var b = scanner.next().toInt()
        array[i] = a + b
    }

    for(i: Int in 0..t-1)
        println(array[i])
}