package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Solved
 */

// https://www.acmicpc.net/problem/11653
public class BOJ_11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        ArrayList<Integer> primeFactors = new ArrayList<>();

        while(input != 1) {
            for (int i = 2; ; i++) {
                if(input % i == 0) {
                    primeFactors.add(i);
                    input /= i;
                    break;
                }
            }
        }

        Collections.sort(primeFactors);

        for (int tmp : primeFactors) {
            System.out.println(tmp);
        }
    }
}
