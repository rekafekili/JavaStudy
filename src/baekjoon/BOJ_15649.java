package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Solved
 */
// https://www.acmicpc.net/problem/15649
public class BOJ_15649 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        boolean[] checkArray = new boolean[N + 1];
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            list.add(i);
            checkArray[i] = true;
            dfs(list, checkArray, M);
            list.clear();
            Arrays.fill(checkArray, false);
        }
    }

    private static void dfs(ArrayList<Integer> list, boolean[] checkArray, int m) {
        if(--m == 0) {
            for (int tmp : list) {
                System.out.print(tmp + " ");
            }
            System.out.println();
        } else {
            for (int i = 1; i < checkArray.length; i++) {
                if(!checkArray[i]) {
                    list.add(i);
                    checkArray[i] = true;
                    dfs(list, checkArray, m);
                    list.remove(list.size()-1);
                    checkArray[i] = false;
                }
            }
        }
    }
}
