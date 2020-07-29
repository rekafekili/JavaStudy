package baekjoon;

import java.util.Scanner;

/**
 * Solved
 */
// https://www.acmicpc.net/problem/11724
public class BOJ_11724 {

    private static boolean[][] edgeTable;
    private static boolean[] visited;
    private static int nodeNumber;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        nodeNumber = sc.nextInt();
        int edgeNumber = sc.nextInt();

        int components = 0;
        edgeTable = new boolean[nodeNumber + 1][nodeNumber + 1];
        visited = new boolean[nodeNumber + 1];

        for (int i = 0; i < edgeNumber; i++) {
            int src = sc.nextInt();
            int dest = sc.nextInt();

            edgeTable[src][dest] = true;
            edgeTable[dest][src] = true;
        }

        for (int i = 1; i <= nodeNumber; i++) {
            if (!visited[i]) {
                dfs(i);
                components++;
            }
        }

        System.out.println(components);
    }

    private static void dfs(int index) {
        for (int i = 1; i <= nodeNumber; i++) {
            if(edgeTable[index][i] && !visited[i]) {
                visited[i] = true;
                dfs(i);
            }
        }
    }
}
