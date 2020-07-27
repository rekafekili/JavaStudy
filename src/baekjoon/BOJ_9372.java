package baekjoon;

import java.util.Scanner;

// https://www.acmicpc.net/problem/9372
public class BOJ_9372 {
    int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; i++) {
            int nation = sc.nextInt();
            int airplane = sc.nextInt();
            int[][] airTable = new int[nation+1][nation+1];

            for (int j = 0; j < airplane; j++) {
                int src = sc.nextInt();
                int dest = sc.nextInt();
                airTable[src][dest] = 1;
                airTable[dest][src] = 1;
            }

//            int
//            routing(0, airTable);
        }
    }

    private static void routing(int[][] airTable) {
        for (int i = 0; i < airTable.length; i++) {
            for (int j = 0; j < airTable[i].length; j++) {

            }
        }
    }
}