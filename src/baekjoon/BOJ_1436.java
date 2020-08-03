package baekjoon;

import java.util.Scanner;

// https://www.acmicpc.net/problem/1436
public class BOJ_1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int series = sc.nextInt();

        int sixCount = (series - 1) / 10;
        int prefix = ((series - 1) % 10);

        if (prefix != 0) {
            System.out.print(prefix);
        }

        for (int i = 0; i < sixCount + 3; i++) {
            System.out.print("6");
        }
    }
}
