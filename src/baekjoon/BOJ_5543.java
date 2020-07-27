package baekjoon;

import java.util.Scanner;

/**
 * Solved
 */
// https://www.acmicpc.net/problem/5543
public class BOJ_5543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int burgerMin = 2001;
        int beverageMin = 2001;
        for (int i = 0; i < 3; i++) {
            int burger = sc.nextInt();
            burgerMin = Math.min(burger, burgerMin);
        }

        for (int i = 0; i < 2; i++) {
            int beverage = sc.nextInt();
            beverageMin = Math.min(beverage, beverageMin);
        }

        System.out.println(burgerMin + beverageMin - 50);
    }
}
