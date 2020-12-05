package boj_kotlin

import kotlin.math.max
import kotlin.math.min

/**
 * Solved
 *
 * https://www.acmicpc.net/problem/1934
 */
fun main() {
    val testCase = readLine()!!.toInt()

    for (i in 1..testCase) {
        val input = readLine()!!
        val first = input.split(" ")[0].toInt()
        val second = input.split(" ")[1].toInt()

        var target = max(first, second)
        var divider = min(first, second)

        while (target % divider != 0) {
            val mod = target % divider
            target = divider
            divider = mod
        }

        println(divider * (first/divider) * (second/divider))
    }
}