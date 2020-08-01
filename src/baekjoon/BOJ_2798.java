package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BOJ_2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] cards = new int[M];
        for (int i = 0; i < N; i++) {
            cards[i] = sc.nextInt();
        }

        int max = 0;

        for (int i = 0; i < cards.length - 2; i++) {
            for (int j = i+1; j < cards.length - 1; j++) {
                for (int k = j+1; k < cards.length; k++) {
                    if(cards[i] == 0 || cards[j] == 0 || cards[k] == 0)
                        continue;

                    int total = cards[i] + cards[j] + cards[k];
                    if(total == M) {
                        max = total;
                        break;
                    } else if(total < M) {
                        max = Math.max(total, max);
                    }
                }
            }
        }

        System.out.println(max);
    }
}
