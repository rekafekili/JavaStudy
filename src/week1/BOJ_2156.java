package week1;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2156
public class BOJ_2156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cup = sc.nextInt();
        int[] cups = new int[cup];

        for (int i = 0; i < cup; i++) {
            cups[i] = sc.nextInt();
        }

        int result = 0;
        for (int i = 0; i < cup; i++) {
            int count = 0;
            int tmpTotal = 0;
            for(int j=i; j < cup; j++) {
                if(count != 2) {
                    tmpTotal += cups[j];
                    count++;
                } else {
                    count = 0;
                }
            }
            if(result == 0) {
                result = tmpTotal;
            } else {
                result = Math.max(result, tmpTotal);
            }
        }

        System.out.println(result);
    }
}