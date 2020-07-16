package baekjoon;

import java.util.Scanner;

// https://www.acmicpc.net/problem/14501
public class BOJ_14501 {
    private int result = 0;
    private static int[] Ts = new int[6];
    private static int[] Ps = new int[1001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; i++) {
            Ts[i] = sc.nextInt();
            Ps[i] = sc.nextInt();
        }

        // 다이나믹 프로그래밍 풀이 몇개만 볼것
        // 모든 경우의 수를 생각해보자.
    }

    public void calculate(int day, int total, int coolTime) {

    }
}
