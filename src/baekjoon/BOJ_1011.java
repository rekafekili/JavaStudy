package baekjoon;

import java.util.Scanner;

// https://www.acmicpc.net/problem/1011
public class BOJ_1011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            solve(x, y);
        }
    }

    private static void solve(int x, int y) {
        int distance = y - x;

        int bigRange = 2;
        int smallRangeMax = 1;
        int smallRange = 1;
        int result = 0;
        for (int i = 1; i <= distance; i++) {
            if(--smallRange == 0) {
                if(--bigRange == 0) {
                    bigRange = 2;
                }
                smallRange = smallRangeMax;
                result++;
            }
        }

        System.out.println(result);
    }
}
