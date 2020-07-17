package baekjoon;

import java.util.Scanner;

// https://www.acmicpc.net/problem/5585
public class BOJ_5585 {
    public static void main(String[] args) {
        int[] coins = {500, 100, 50, 10, 5, 1};

        Scanner sc = new Scanner(System.in);

        int pay = sc.nextInt();
        int change = 1000-pay;
        int result = 0;

        for (int coin : coins) {
            int divide = change / coin;
            if (divide > 0) {
                result += divide;
                change -= divide * coin;
            }
        }

        System.out.println(result);
    }
}
