package Chapter5

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var array = Array<Int>(9, {0})

    for(i: Int in 0..array.size - 1) {
        array[i] = scanner.next().toInt()
    }

    var max = array[0]
    var location = 1
    for(i: Int in 0..array.size - 1) {
        if(max < array[i]) {
            max = array[i]
            location = i + 1
        }
    }

    println("$max\n$location")
}