package boj_kotlin

import java.math.BigInteger

/**
 * Solved
 *
 * https://www.acmicpc.net/problem/9461
 */
fun main() {
    val testCase = readLine()!!.toInt()
    val baseNumbers = arrayListOf(BigInteger.valueOf(0), BigInteger.valueOf(1), BigInteger.valueOf(1), BigInteger.valueOf(1), BigInteger.valueOf(2))

    for (i in 0 until testCase) {
        val N = readLine()!!.toInt()

        when(N) {
            1 -> println(1)
            2 -> println(1)
            3 -> println(1)
            4 -> println(2)
            else -> {
                if(N > baseNumbers.size - 1) {
                    for (j in (baseNumbers.size)..N) {
                        val sum = baseNumbers[j-1] + baseNumbers[j-5]
                        baseNumbers.add(sum)
                    }
                }

                println(baseNumbers[N])
            }
        }
    }
}