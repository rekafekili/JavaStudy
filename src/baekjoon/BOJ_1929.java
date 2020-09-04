package baekjoon;

import java.util.Scanner;

public class BOJ_1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
