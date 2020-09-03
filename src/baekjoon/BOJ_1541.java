package baekjoon;

import java.util.Scanner;

/**
 * Solved
 */

// https://www.acmicpc.net/problem/1541
public class BOJ_1541 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String formula = sc.next();
        int result = 0;

        String[] addingElement = formula.split("-");

        for (int i = 0; i < addingElement.length; i++) {
            if(i == 0) {
                result = parsing(addingElement[i]);
            } else {
                result -= parsing(addingElement[i]);
            }
        }

        System.out.println(result);
    }

    private static int parsing(String element) {
        if(element.contains("+")) {
            int sum = 0;
            String[] strings = element.split("\\+");
            for (String str : strings) {
                sum += Integer.parseInt(str);
            }

            return sum;
        } else {
            return Integer.parseInt(element);
        }
    }
}
