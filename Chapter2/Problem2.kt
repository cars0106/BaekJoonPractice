package Chapter2

fun main() {
    var grade = readLine()!!.toInt()

    if(grade >= 90)
        println("A")
    else if(grade >= 80)
        println("B")
    else if(grade >= 70)
        println("C")
    else if(grade >= 60)
        println("D")
    else
        println("F")
}