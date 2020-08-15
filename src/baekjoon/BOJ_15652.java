package baekjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Solved
 */

// https://www.acmicpc.net/problem/15652
public class BOJ_15652 {

    private static BufferedWriter bw;
    private static int M;
    private static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = sc.nextInt();
        M = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < N + 1; i++) {
            list.add(i);
            dfs(list, M);
            list.clear();
        }
    }

    private static void dfs(ArrayList<Integer> list, int m) {
        if(--m == 0) {
            try {
                printArray(list);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            int lastNumber = list.get(list.size() - 1);
            for (int i = 1; i < N + 1; i++) {
                if(i >= lastNumber) {
                    list.add(i);
                    dfs(list, m);
                    list.remove(list.size() - 1);
                }
            }
        }
    }

    private static void printArray(ArrayList<Integer> list) throws IOException {
        for (int tmp : list) {
            bw.write(tmp + " ");
        }
        bw.write("\n");
        bw.flush();
    }
}
