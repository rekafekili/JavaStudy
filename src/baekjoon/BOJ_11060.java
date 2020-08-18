package baekjoon;

import java.util.Scanner;

/**
 * Solved
 */

// https://www.acmicpc.net/problem/11060
public class BOJ_11060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int goal = sc.nextInt();

        int numerator = 1;
        int denominator = 1;
        int count = 1;
        boolean upDown = false; // UP : True, DOWN : False

        while(goal != count) {
            count++;

            if(numerator == 1 && denominator%2 != 0) {
                // 분자가 1이고, 분모가 홀수일 경우 -> 분모++
                denominator++;
                upDown = false;
            } else if(denominator==1 && numerator%2 == 0) {
                // 분모가 1이고, 분자가 짝수일 경우 -> 분자++
                numerator++;
                upDown = true;
            } else {
                if(upDown) {
                    numerator--;
                    denominator++;
                } else {
                    numerator++;
                    denominator--;
                }
            }
        }

        System.out.println(numerator + "/" + denominator);
    }
}
