package boj_kotlin

import java.math.BigInteger

fun main() {
    val target = readLine()!!.toInt()

    val numbers = arrayListOf<BigInteger>(BigInteger.valueOf(0), BigInteger.valueOf(1))

    when (target) {
        0 -> {
            println(numbers[0])
        }
        1 -> {
            println(numbers[1])
        }
        else -> {
            for (i in 2..target) {
                numbers.add(numbers[i-1] + numbers[i-2])
            }

            println(numbers[target])
        }
    }
}