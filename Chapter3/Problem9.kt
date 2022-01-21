package Chapter3

fun main() {
    var n = readLine()!!.toInt()

    for(i:Int in 1..n) {
        for (j: Int in 1..i)
            print("*")
        println()
    }
}