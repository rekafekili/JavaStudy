package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Solved
 */

// https://www.acmicpc.net/problem/3036
public class BOJ_3036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();
        int[] rings = new int[testCase];

        for (int i = 0; i < testCase; i++) {
            rings[i] = sc.nextInt();
        }

        ArrayList<String> results = solve(rings);

        for (String rs : results) {
            System.out.println(rs);
        }
    }

    private static ArrayList<String> solve(int[] rings) {
        ArrayList<String> res = new ArrayList<>();

        int first = rings[0];

        for (int i = 1; i < rings.length; i++) {
            res.add(getCommons(rings[i], first));
        }

        return res;
    }

    private static String getCommons(int ring, int first) {
        while(true) {
            boolean isComplete = true;
            for (int i = 2; i < 1000; i++) {
                if(ring % i == 0 && first % i == 0) {
                    ring /= i;
                    first /= i;

                    isComplete = false;
                    break;
                }
            }
            if(isComplete) break;
        }

        return "" + first + "/" + ring;
    }
}
