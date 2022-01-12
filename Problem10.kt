import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.next().toInt()
    val b = scanner.next().toInt()
    val c = scanner.next().toInt()

    println((a+b)%c)
    println(((a%c)+(b%c))%c)
    println((a*b)%c)
    println(((a%c)*(b%c))%c)
}