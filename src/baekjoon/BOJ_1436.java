package baekjoon;

import java.util.Scanner;

// https://www.acmicpc.net/problem/1436
public class BOJ_1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int series = sc.nextInt();
        int count = 0;

        int i = 666;
        while(true) {
            if(Integer.toString(i).contains("666")) {
                count++;
                if(count == series) {
                    System.out.println(i);
                    return;
                }
            }

            i++;
        }
    }
}
