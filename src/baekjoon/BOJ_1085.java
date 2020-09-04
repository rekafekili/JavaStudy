package baekjoon;

import java.util.Scanner;

/**
 * Solved
 */

// https://www.acmicpc.net/problem/1085
public class BOJ_1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int right = w - x;
        int top = h - y;

        int toRightTop = Math.min(right, top);
        int toLeftBottom = Math.min(x, y);

        System.out.println(Math.min(toRightTop, toLeftBottom));
    }
}
