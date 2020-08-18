package baekjoon;

import java.util.Scanner;

/**
 * Solved
 */

// https://www.acmicpc.net/problem/2292
public class BOJ_2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        int floor = 0;
        int floorGap = 1;
        int count = 1;

        if(input == 1) {
            System.out.println(1);
            return;
        }

        while (true) {
            int start = floor * 6 + 2;
            int end = (floor + floorGap) * 6 + 1;

            if(input >= start && input <= end) {
                System.out.println(count + 1);
                return;
            }

            floor += floorGap;
            floorGap++;
            count++;
        }
    }
}
