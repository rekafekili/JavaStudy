package baekjoon;

import java.util.Scanner;

/**
 * Solved
 */

// https://www.acmicpc.net/problem/10872
public class BOJ_10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        int result = 1;
        for (int i = input; i > 1; i--) {
            result *= i;
        }

        System.out.println(result);
    }
}
