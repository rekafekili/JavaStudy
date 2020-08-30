package baekjoon;

import java.util.Scanner;

/**
 * Solved
 */

// https://www.acmicpc.net/problem/2581
public class BOJ_2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = 10001;
        int total = 0;
        int M = sc.nextInt();
        int N = sc.nextInt();

        for (int i = M; i <= N; i++) {
            if(checkPrime(i)) {
                total += i;
                if(i < min) {
                    min = i;
                }
            }
        }

        if(total == 0) {
            System.out.println(-1);
        } else {
            System.out.println(total);
            System.out.println(min);
        }
    }

    private static boolean checkPrime(int value) {
        if(value == 1) {
            return false;
        } else {
            for (int i = 2; i < value; i++) {
                if(value % i == 0) {
                    return false;
                }
            }

            return true;
        }
    }
}
