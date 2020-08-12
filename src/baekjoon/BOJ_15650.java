package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Solved
 */

// https://www.acmicpc.net/problem/15650
public class BOJ_15650 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        boolean[] checkArray = new boolean[N + 1];

        for (int i = 1; i < checkArray.length; i++) {
            checkArray[i] = true;
            list.add(i);
            dfs(list, checkArray, M);
            list.clear();
        }
    }

    private static void dfs(ArrayList<Integer> list, boolean[] checkArray, int m) {
        if (--m == 0) {
            for (int tmp : list) {
                System.out.print(tmp + " ");
            }
            System.out.println();
        } else {
            int lastNumber = list.get(list.size() - 1);
            for (int i = 1; i < checkArray.length; i++) {
                if(!checkArray[i] && i >lastNumber) {
                    list.add(i);
                    dfs(list, checkArray, m);
                    list.remove(list.size() - 1);
                }
            }
        }
    }
}
