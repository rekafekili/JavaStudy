package boj_kotlin

/**
 * Solved
 *
 * https://www.acmicpc.net/problem/10953
 */
fun main() {
    val testCase = readLine()!!.toInt()

    for(i in 0 until testCase) {
        val input = readLine()
        val A = input!!.split(",")[0].toInt()
        val B = input.split(",")[1].toInt()

        println(A + B)
    }
}