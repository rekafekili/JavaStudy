package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Solved
 */

// https://www.acmicpc.net/problem/1427
public class BOJ_1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        char[] arr = input.toCharArray();

        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}
