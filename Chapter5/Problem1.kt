package Chapter5

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    var n = scanner.next().toInt()
    var array = Array<Int>(n, {0})

    for(i: Int in 0..n-1) {
        array[i] = scanner.next().toInt()
    }

    var min = 1000000
    var max = -1000000
    for(i: Int in 0..n-1) {
        if(array[i] < min)
            min = array[i]
        if(array[i] > max)
            max = array[i]
    }

    println("$min $max")
}