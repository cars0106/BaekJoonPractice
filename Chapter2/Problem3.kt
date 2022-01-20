package Chapter2

fun main() {
    var year = readLine()!!.toInt()

    if((year % 400) == 0)
        println("1")
    else if(((year % 4) == 0) || ((year % 100) != 0))
        println("1")
    else
        println("0")
}