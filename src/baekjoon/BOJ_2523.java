package baekjoon;

import java.util.Scanner;

/**
 * Solved
 */
// https://www.acmicpc.net/problem/2523
public class BOJ_2523 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 0; i < 2 * number - 1; i++) {
            int count = 0;
            if (i <= number - 1) {
                count = i + 1;
            } else {
                count = 2 * number - i - 1;
            }
            for (int j = 0; j < count; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
