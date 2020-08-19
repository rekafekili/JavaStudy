package baekjoon;

import java.io.*;
import java.util.Scanner;

/**
 * Solved - Repeat
 */

// https://www.acmicpc.net/problem/2869
public class BOJ_2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();

        int day = (V - B - 1) / (A - B) + 1;

        System.out.println(day);
    }
}
