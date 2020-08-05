package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Solved
 */

// https://www.acmicpc.net/problem/2751
public class BOJ_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < testCase; i++) {
            arr.add(Integer.valueOf(br.readLine()));
        }

        Collections.sort(arr);

        for (int value : arr) {
            System.out.println(value);
        }
    }
}
