package baekjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Solved
 * Note : sout <<<<<<<<<< bw
 */

// https://www.acmicpc.net/problem/15651
public class BOJ_15651 {

    private static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = sc.nextInt();
        int M = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(i);
            dfs(list, N, M);
        }
    }

    private static void dfs(ArrayList<Integer> list, int n, int m) throws IOException {
        if (--m == 0) {
            for (int tmp : list) {
                bw.write(tmp + " ");
            }
            bw.write("\n");
            bw.flush();
        } else {
            for (int i = 1; i <= n; i++) {
                list.add(i);
                dfs(list, n, m);
                list.remove(list.size() - 1);
            }
        }
    }
}
