package baekjoon;

import java.util.Scanner;

/**
 * Solved
 */

// https://www.acmicpc.net/problem/1929
public class BOJ_1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M_start = sc.nextInt();
        int N_end = sc.nextInt();

        // false : 소수, true : 소수가 아님
        boolean[] numbers = new boolean[N_end + 1];

        numbers[1] = true;
        for (int i = 1; i <= N_end; i++) {
            if(!numbers[i]) {
                // 배수 찾기
                int start = (int) Math.pow(i, 2);
                if(start > 1000000) {
                    continue;
                }

                for (int j = 0; ; j++) {
                    int current = start + i*j;
                    if(current > 1000000 || current > N_end) {
                        break;
                    } else {
                        if(!numbers[current]) {
                            numbers[current] = true;
                        }
                    }
                }
            }
        }

        for (int i = M_start; i <= N_end; i++) {
            if(!numbers[i]) {
                System.out.println(i);
            }
        }
    }
}
