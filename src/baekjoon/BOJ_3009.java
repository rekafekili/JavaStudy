package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Solved
 */

// https://www.acmicpc.net/problem/3009
public class BOJ_3009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> xList = new ArrayList<>();
        ArrayList<Integer> yList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(!xList.contains(x)) {
                xList.add(x);
            } else {
                xList.remove((Integer)x);
            }

            if(!yList.contains(y)) {
                yList.add(y);
            } else {
                yList.remove((Integer)y);
            }
        }

        System.out.println(xList.get(0) + " " + yList.get(0));
    }
}
