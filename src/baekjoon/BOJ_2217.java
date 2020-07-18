package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

// https://www.acmicpc.net/problem/2217
public class BOJ_2217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();
        int[] arr = new int[testCase];
        int max = 0;

        for (int i = 0; i < testCase; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        for (int i = 0; i < testCase; i++) {
            int total = arr[i] * (testCase - i);
            max = Math.max(total, max);
        }

        System.out.println(max);
    }
}