package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2981 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();
        int[] numbers = new int[testCase];
        ArrayList<Integer> results = new ArrayList<>();

        for (int i = 0; i < testCase; i++) {
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);

        int minimum = numbers[0];

        for (int i = minimum; i > 1; i--) {
            for (int j = 0; j < numbers.length; j++) {

            }
        }

        for(int tmp : results) {
            System.out.print(tmp + " ");
        }
    }
}
