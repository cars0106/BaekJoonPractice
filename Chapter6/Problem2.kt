package Chapter6

fun main() {
    fun han(n: Int): Boolean {
        var num = n
        val array = ArrayList<Int>()

        while(num != 0) {
            array.add(num % 10)
            num /= 10
        }

        if(array.size >= 3) {
            var count = 0
            for (i: Int in 0..array.size-3) {
                if ((array[i] - array[i + 1]) == (array[i + 1] - array[i + 2]))
                    count++
            }
            if(count == array.size-2)
                return true
            else
                return false
        }
        else
            return true
    }

    val n = readLine()!!.toInt()
    var count = 0
    for(i:Int in 1..n) {
        if(han(i))
            count++
    }
    println(count)
}