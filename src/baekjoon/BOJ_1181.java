package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Solved
 */

// https://www.acmicpc.net/problem/1181
public class BOJ_1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < testCase; i++) {
            String input = sc.next();
            if(!list.contains(input))
                list.add(input);
        }

        list.sort((str1, str2) -> {
            if(str1.length() != str2.length()) {
                return str1.length() - str2.length();
            } else {
                return str1.compareTo(str2);
            }
        });

        for (String tmp : list) {
            System.out.println(tmp);
        }
    }
}
