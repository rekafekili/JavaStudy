package baekjoon;

import java.util.Scanner;

/**
 * Solved
 */
// https://www.acmicpc.net/problem/2231
public class BOJ_2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        for (int i = 1; i < 1000001; i++) {
            int total = 0;
            int currentNum = i;

            int len = Integer.toString(i).length();
            for (int j = len-1; j >= 0 ; j--) {
                int tens = (int) Math.pow(10, j);

                int digit = currentNum / tens;
                total += digit;
                currentNum -= digit * tens;
            }

            if (i + total == input) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(0);
    }
}