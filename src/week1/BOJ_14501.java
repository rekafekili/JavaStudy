package week1;

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
    }

    public void calculate(int day, int total, int coolTime) {

    }
}
