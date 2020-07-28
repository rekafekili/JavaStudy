package baekjoon;

import java.util.Scanner;

/**
 * Solved
 */
// https://www.acmicpc.net/problem/2446
public class BOJ_2446 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 0; i < 2 * number - 1; i++) {
            int count = 0;
            if (i <= number - 1) {
                count = i;
            } else {
                count = 2 * number - i - 2;
            }
            for (int j = 0; j < count; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * number - 1 - 2 * count; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
