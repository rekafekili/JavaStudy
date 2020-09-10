package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Solved
 */

// https://www.acmicpc.net/problem/1037
public class BOJ_1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();
        int[] arr = new int[testCase];

        for (int i = 0; i < testCase; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println(arr[0] * arr[arr.length-1]);
    }
}
