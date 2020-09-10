package baekjoon;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Solved
 */

// https://www.acmicpc.net/problem/9375
public class BOJ_9375 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();
        String currentType = "";
        HashMap<String, Integer> clothes;

        for (int i = 0; i < testCase; i++) {
            int cases = sc.nextInt();
            clothes = new HashMap<>();

            for (int j = 0; j < cases; j++) {
                String input = sc.next();
                String type = sc.next();
                currentType = type;

                if (!clothes.containsKey(type)) {
                    clothes.put(type, 1);
                } else {
                    clothes.put(type, clothes.get(type) + 1);
                }
            }

            if(clothes.size() == 1) {
                System.out.println(clothes.get(currentType));
            } else {
                int result = 1;
                for (String tmp : clothes.keySet()) {
                    result *= (clothes.get(tmp) + 1);
                }
                System.out.println(result - 1);
            }
        }
    }
}