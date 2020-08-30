package baekjoon;

import java.util.Scanner;

/**
 * Solved
 */

// https://www.acmicpc.net/problem/1978
public class BOJ_1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();
        int result = 0;

        for (int i = 0; i < testCase; i++) {
            int number = sc.nextInt();

            if(number == 1) {
                continue;
            }

            if(checkPrime(number)) {
                result++;
            }
        }

        System.out.println(result);
    }

    private static boolean checkPrime(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if(number % i == 0) {
                count++;
            }
        }

        return (count == 2);
    }
}
