package baekjoon;

import java.util.Scanner;

// https://www.acmicpc.net/problem/6603
public class BOJ_6603 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int testCase = sc.nextInt();
            if (testCase == 0) break;

            int[] lottoNumbers = new int[testCase];
            for (int i = 0; i < testCase; i++) {
                lottoNumbers[i] = sc.nextInt();
            }

            for (int i = 0; i < lottoNumbers.length; i++) {
                for (int j = i + 1; j < lottoNumbers.length; j++) {
                    for (int k = j + 1; k < lottoNumbers.length; k++) {
                        for (int l = k + 1; l < lottoNumbers.length; l++) {
                            for (int m = l + 1; m < lottoNumbers.length; m++) {
                                for (int n = m + 1; n < lottoNumbers.length; n++) {
                                    System.out.println(
                                            lottoNumbers[i] + " " +
                                            lottoNumbers[j] + " " +
                                            lottoNumbers[k] + " " +
                                            lottoNumbers[l] + " " +
                                            lottoNumbers[m] + " " +
                                            lottoNumbers[n]);
                                }
                            }
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}
