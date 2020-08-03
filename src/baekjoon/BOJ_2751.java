package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String testCase = br.readLine();
        int[] arr = new int[Integer.parseInt(testCase)];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for (int value : arr) {
            bw.write(Integer.toString(value));
            bw.newLine();
        }

        bw.close();
    }
}
