package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Solved
 */

// https://www.acmicpc.net/problem/2609
public class BOJ_2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        int second = sc.nextInt();
        ArrayList<Integer> primeFactors = new ArrayList<>();

        while(true) {
            boolean isComplete = true;
            for (int i = 2; i < 10000; i++) {
                if(first % i == 0 && second % i == 0) {
                    primeFactors.add(i);

                    first /= i;
                    second /= i;

                    isComplete = false;
                    break;
                }
            }
            if(isComplete) break;
        }

        int result = 1;
        for (int tmp : primeFactors) {
            result *= tmp;
        }

        System.out.println(result);
        System.out.println(result * first * second);
    }
}
