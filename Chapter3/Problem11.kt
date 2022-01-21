package Chapter3

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    var n = scanner.next().toInt()
    var x = scanner.next().toInt()
    var array = Array<Int>(n, {0})

    for(i: Int in 1..n) {
        var tmp = scanner.next().toInt()
        array[i-1] = tmp
    }

    for(i: Int in 1..n) {
        if(x > array[i-1])
            print("${array[i-1]} ")
    }
}