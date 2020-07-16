package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

// https://www.acmicpc.net/problem/1010
public class BOJ_1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            if (N == M) {
                System.out.println(1);
            } else if (N == 1) {
                System.out.println(M);
            } else {
                solve(N, M);
            }
        }
    }

    private static void solve(int n, int m) {
        BigInteger result = factorial(m).divide(factorial(m - n).multiply(factorial(n)));
        System.out.println(result);
    }

    private static BigInteger factorial(int d) {
        BigInteger result = BigInteger.valueOf(1);

        for (int i = d; i > 0; i--) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }
}
