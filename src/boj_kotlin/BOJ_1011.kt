package boj_kotlin

/**
 * Solved
 *
 * https://www.acmicpc.net/problem/1011
 */
fun main() {
    val testCase = readLine()!!.toInt()

    for (test in 0 until testCase) {
        val input = readLine()!!.split(" ")
        val distance = input[1].toInt() - input[0].toInt()
        var warp = 0.toDouble()
        var result = 0

        for (i in 1 until 2147483648) {
            warp = i.toDouble()
            if (warp * warp > distance) {
                break
            }
        }

        result = when {
            (warp * warp == distance.toDouble()) ->
                (2 * warp - 1).toInt()
            (((warp * warp) + ((warp - 1) * (warp - 1))) / 2 < distance) ->
                (2 * warp - 1).toInt()
            ((warp - 1) * (warp - 1) < distance) ->
                (2 * warp - 1).toInt() - 1
            else ->
                (2 * warp - 1).toInt() - 2
        }

        println(result)
    }
}