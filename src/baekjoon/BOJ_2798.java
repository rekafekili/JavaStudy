package baekjoon;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 * Solved
 */

// https://www.acmicpc.net/problem/2798
public class BOJ_2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<Integer> cards = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int input = sc.nextInt();
            cards.add(input);
        }

        Collections.reverse(cards);
        int max = 0;

        for (int i = 0; i < cards.size() - 2; i++) {
            for (int j = i + 1; j < cards.size() - 1; j++) {
                for (int k = j + 1; k < cards.size(); k++) {
                    if (cards.get(i) == 0 || cards.get(j) == 0 || cards.get(k) == 0)
                        continue;

                    int total = cards.get(i) + cards.get(j) + cards.get(k);
                    if (total == M) {
                        max = total;
                        break;
                    } else if (total < M) {
                        max = Math.max(total, max);
                    }
                }
            }
        }

        System.out.println(max);
    }
}
