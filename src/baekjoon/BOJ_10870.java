package baekjoon;

import java.util.Scanner;

/**
 * Solved
 */

// https://www.acmicpc.net/problem/10870
public class BOJ_10870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int[] fibonacci = new int[input+1];
        if(input == 0) {
            System.out.println(0);
        } else if(input == 1) {
            System.out.println(1);
        } else {
            fibonacci[0] = 0;
            fibonacci[1] = 1;

            for (int i = 2; i <= input; i++) {
                fibonacci[i] = fibonacci[i-2] + fibonacci[i-1];
            }

            System.out.println(fibonacci[input]);
        }
    }
}
