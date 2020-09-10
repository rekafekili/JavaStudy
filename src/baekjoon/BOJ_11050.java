package baekjoon;

import java.util.Scanner;

/**
 * Solved
 */

// https://www.acmicpc.net/problem/11050
public class BOJ_11050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int result = factorial(N) / (factorial(K)*factorial(N-K));

        System.out.println(result);
    }

    private static int factorial(int num) {
        int res = 1;

        for (int i = num; i > 1; i--) {
            res *= i;
        }

        return res;
    }
}
