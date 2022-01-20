package Chapter2

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    var hour = scanner.next().toInt()
    var min = scanner.next().toInt()

    min = min - 45

    if(min < 0) {
        hour = hour - 1
        min = min + 60
        if(hour < 0) {
            hour = hour + 24
            println("$hour $min")
        }
        else
            println("$hour $min")
    }
    else
        println("$hour $min")
}