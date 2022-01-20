package Chapter2

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var a = scanner.next().toInt()
    var b = scanner.next().toInt()

    if(a > b)
        println(">")
    else if(a < b)
        println("<")
    else
        println("==")
}