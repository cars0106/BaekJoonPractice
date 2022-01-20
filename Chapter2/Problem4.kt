package Chapter2

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    var x = scanner.next().toInt()
    var y = scanner.next().toInt()

    if(x > 0) {
        if(y > 0)
            println("1")
        else
            println("4")
    }
    else {
        if(y > 0)
            println("2")
        else
            println("3")
    }
}