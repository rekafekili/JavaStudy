package baekjoon;

import java.util.Scanner;

public class BOJ_2740 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] matrixA = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrixA[i][j] = sc.nextInt();
            }
        }

        int A = sc.nextInt();
        int K = sc.nextInt();

        int[][] matrixB = new int[A][K];

        for (int i = 0; i < A; i++) {
            for (int j = 0; j < K; j++) {
                matrixB[i][j] = sc.nextInt();
            }
        }

        int[][] matrixResult = new int[N][K];

        
    }
}
