package boj_kotlin

import java.lang.Integer.max
import kotlin.math.hypot

/**
 * Solved
 *
 * https://www.acmicpc.net/problem/1002
 */
fun main() {
    val testCase = readLine()!!.toInt()

    for (i in 1..testCase) {
        val data = readLine()

        println(getTarget(data!!.split(" ")))
    }
}

fun getTarget(data: List<String>): Int? {
    val x1 = data[0].toInt()
    val y1 = data[1].toInt()
    val r1 = data[2].toInt()
    val x2 = data[3].toInt()
    val y2 = data[4].toInt()
    val r2 = data[5].toInt()

    val distance = hypot((x1 - x2).toDouble(), (y1 - y2).toDouble())

    if (distance == 0.0) {
        return if (r1 == r2) -1 else 0
    } else {
        val longDis = max(r1, r2)
        if (distance < longDis) {
            if (longDis == r1) {
                return when {
                    (distance + r2.toDouble()) < r1 -> {
                        0
                    }
                    (distance + r2.toDouble()) == r1.toDouble() -> {
                        1
                    }
                    else -> {
                        2
                    }
                }
            }

            if (longDis == r2) {
                return when {
                    (distance + r1.toDouble()) < r2 -> {
                        0
                    }
                    (distance + r1.toDouble()) == r2.toDouble() -> {
                        1
                    }
                    else -> {
                        2
                    }
                }
            }
        } else if (distance == longDis.toDouble()) {
            return 2
        } else {
            return when {
                distance > (r1 + r2).toDouble() -> {
                    0
                }
                distance == (r1 + r2).toDouble() -> {
                    1
                }
                else -> {
                    2
                }
            }
        }
    }

    return 0
}
