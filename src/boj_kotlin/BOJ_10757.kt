package boj_kotlin

fun main() {
    val input = readLine()?.split(" ") ?: return

    val A = input[0].toBigInteger()
    val B = input[1].toBigInteger()

    println(A.add(B))
}