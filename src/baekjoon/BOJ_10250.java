package baekjoon;

import java.util.Scanner;

/**
 * Solved
 */

// https://www.acmicpc.net/problem/10250
public class BOJ_10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; i++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            int XX;
            int YY;
            if(N%H == 0) {
                XX = N/H;
                YY = H;
            } else {
                XX = (N/H) + 1;
                YY = N%H;
            }

            System.out.println(String.format("%d%02d", YY, XX));
        }
    }
}
