package Chapter6

fun main() {
    fun d(n: Int): Int {
        var number = n
        var result = n
        while(number != 0) {
            result += (number % 10)
            number /= 10
        }
        return result
    }

    var array = Array<Int>(10000, {0})
    for(i:Int in 1..10000) {
        array[i-1] = i
    }
    for(i:Int in 1..10000) {
        for(j:Int in i..10000) {
            if(d(i) == j)
                array[j-1] = 0
        }
    }
    for(i:Int in 1..10000) {
        if(array[i-1] != 0)
            println(array[i-1])
    }
}