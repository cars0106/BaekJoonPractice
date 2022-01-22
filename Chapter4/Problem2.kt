package Chapter4

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))

    while(true) {
        val str = br.readLine() ?: break
        val (a, b) = str.split(" ").map { it.toInt() }
        bw.write("${a+b}\n")
    }

    bw.flush()
    bw.close()
    br.close()
}