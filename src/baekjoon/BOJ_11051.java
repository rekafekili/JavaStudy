package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Solved
 */

// https://www.acmicpc.net/problem/11051
public class BOJ_11051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        BigInteger result = factorial(N).divide(factorial(K).multiply(factorial(N-K)));

        System.out.println(result.remainder(BigInteger.valueOf(10007)));
    }

    private static BigInteger factorial(int num) {
        BigInteger res = BigInteger.valueOf(1);

        for (int i = num; i > 1; i--) {
            res = res.multiply(BigInteger.valueOf(i));
        }

        return res;
    }
}
