package Chapter4

fun main() {
    var n = readLine()!!.toInt()
    var tmp = n
    var count = 0

    while(true) {
        count++
        tmp = ((tmp % 10) * 10) + (((tmp / 10) + (tmp % 10)) % 10)
        if(n == tmp)
            break
    }

    println(count)
}