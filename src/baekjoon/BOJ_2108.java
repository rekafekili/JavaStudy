package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Solved
 */

// https://www.acmicpc.net/problem/2108
public class BOJ_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        int[] numberCount = new int[8002];
        ArrayList<Integer> numbers = new ArrayList<>();

        int total = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < testCase; i++) {
            int input = Integer.parseInt(br.readLine());
            total += input;
            numbers.add(input);
            numberCount[input + 4000]++;
            min = Math.min(min, input);
            max = Math.max(max, input);
        }

        Collections.sort(numbers);

        // 최빈값이 여러 개이면 두 번째로 작은 값
        int tmpMax = 0;
        for (int val : numberCount) {
            tmpMax = Math.max(tmpMax, val);
        }
        int maxCount = tmpMax;
        ArrayList<Integer> maxList = new ArrayList<>();
        for (int i = 0; i < numberCount.length; i++) {
            if (numberCount[i] == maxCount) {
                maxList.add(i - 4000);
            }
        }
        Collections.sort(maxList);

        System.out.println(Math.round((double)total / testCase)); // 산술 평균
        System.out.println(numbers.get(testCase / 2)); // 중앙값
        if(maxList.size() == 1) {
            System.out.println(maxList.get(0));
        } else {
            System.out.println(maxList.get(1)); // 최빈값
        }
        System.out.println(max - min); // 범위
    }
}
