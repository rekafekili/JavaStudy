package boj_kotlin

/**
 * Solved
 *
 * https://www.acmicpc.net/problem/2747
 */

fun main() {
    val n = readLine()!!.toInt()

    println(getFibonacci(n))
}

fun getFibonacci(n: Int): Int {
    return when(n) {
        0 -> 0
        1 -> 1
        2 -> 1
        else -> {
            val initF = arrayOf(0, 0, 1)
            var res = 0
            for(i in 1 until n) {
                initF[0] = initF[1]
                initF[1] = initF[2]

                initF[2] = initF[0] + initF[1]

                res = initF[2]
            }

            return res
        }
    }
}

fun getFibonacci2(n: Int): Int {
    var pair = Pair(0, 1)
    for (i in 0 until n) {
        pair = Pair(pair.second, pair.first + pair.second)
    }

    return pair.first
}
