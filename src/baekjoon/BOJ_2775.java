package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Solved
 */

// https://www.acmicpc.net/problem/2775
public class BOJ_2775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();

            int[] floor = new int[n+1];
            for (int j = 0; j < floor.length; j++) {
                floor[j] = j;
            }

            while(k!=0) {
                if(--k == 0) {
                    int res = 0;
                    for (int tmp : floor) {
                        res += tmp;
                    }
                    System.out.println(res);
                } else {
                    for (int j = floor.length-1; j > 0; j--) {
                        int sum = 0;
                        for (int l = 1; l <= j; l++) {
                            sum += floor[l];
                        }
                        floor[j] = sum;
                    }
                }
            }
        }
    }
}
