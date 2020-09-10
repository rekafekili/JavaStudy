package baekjoon;

import java.util.Scanner;

/**
 * Solved
 */

// https://www.acmicpc.net/problem/5086
public class BOJ_5086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int first = sc.nextInt();
            int second = sc.nextInt();

            if(first == 0 && second == 0) {
                break;
            } else {
                if(second % first == 0) {
                    // 1. factor : first가 second의 약수
                    System.out.println("factor");
                } else if (first % second == 0) {
                    // 2. multiple : first가 second의 배수
                    System.out.println("multiple");
                } else {
                    // 3. neither : 둘 다 아님
                    System.out.println("neither");
                }
            }
        }
    }
}
