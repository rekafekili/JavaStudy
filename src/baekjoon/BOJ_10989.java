package baekjoon;

import java.io.*;
import java.util.Arrays;

/**
 * Solved
 */

// https://www.acmicpc.net/problem/10989
public class BOJ_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        int[] arr = new int[testCase];

        for (int i = 0; i < testCase; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for (int value : arr) {
            bw.write(value + "\n");
        }

        bw.close();
    }
}
