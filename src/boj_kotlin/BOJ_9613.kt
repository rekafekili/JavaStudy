package boj_kotlin

import kotlin.math.max
import kotlin.math.min

fun main() {
    val testCase = readLine()!!.toInt()

    for (i in 1..testCase) {
        val input = readLine()!!
        val numbers = input.split(" ")

        var sum = 0
        for (j in 1 until numbers[0].toInt()) {
            for (k in (j + 1)..numbers[0].toInt()) {
                val first = numbers[j].toInt()
                val second = numbers[k].toInt()

                var target = max(first, second)
                var divider = min(first, second)

                while (target % divider != 0) {
                    val mod = target % divider
                    target = divider
                    divider = mod
                }

                sum += divider
            }
        }

        println(sum)
    }
}