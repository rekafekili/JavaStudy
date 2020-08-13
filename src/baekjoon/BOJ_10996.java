package baekjoon;

import java.util.Scanner;

/**
 * Solved
 */

// https://www.acmicpc.net/problem/10996
public class BOJ_10996 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        boolean mark = true;

        if(input == 1) {
            System.out.println("*");
            return;
        }

        for (int i = 0; i < input * 2; i++) {
            if(i % 2 == 0) {
                mark = true;
            } else {
                mark = false;
            }
            for (int j = 0; j < input; j++) {
                if(mark) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                mark = !mark;
            }
            System.out.println();
        }

    }
}
