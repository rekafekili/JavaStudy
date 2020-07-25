package baekjoon;

import java.util.Scanner;

// https://www.acmicpc.net/problem/1817
public class BOJ_1817 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bookCase = sc.nextInt(); // 책 개수
        int boxMax = sc.nextInt(); // 상자 최대 무게

        int bookTotal = 0;
        for (int i = 0; i < bookCase; i++) {
            bookTotal += sc.nextInt();
        }

        if(bookTotal % boxMax == 0) {
            System.out.println(bookTotal / boxMax);
        } else {
            System.out.println((bookTotal / boxMax) + 1);
        }
    }
}