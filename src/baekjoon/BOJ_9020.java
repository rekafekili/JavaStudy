package baekjoon;

import java.util.Scanner;

/**
 * Solved
 */

// https://www.acmicpc.net/problem/9020
public class BOJ_9020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; i++) {
            int target = sc.nextInt();

            int middle = target / 2;

            if (isPrime(middle)) {
                System.out.println(middle + " " + middle);
            } else {
                for (int j = 1; j < middle; j++) {
                    if (isPrime(middle - j)) {
                        if (isPrime(middle + j)) {
                            System.out.println((middle - j) + " " + (middle + j));
                            break;
                        }
                    }
                }
            }
        }
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
