package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Solved
 */

// https://www.acmicpc.net/problem/11399
public class BOJ_11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int people = sc.nextInt();
        int[] times = new int[people];
        for (int i = 0; i < people; i++) {
            times[i] = sc.nextInt();
        }

        Arrays.sort(times);

        int total = 0;
        for (int tmp : times) {
            total += tmp * people;
            people--;
        }

        System.out.println(total);
    }
}
