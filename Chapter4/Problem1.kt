package Chapter4

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    while(true) {
        var a = scanner.next().toInt()
        var b = scanner.next().toInt()

        if((a == 0) && (b == 0))
            break
        else
            println(a + b)
    }
}