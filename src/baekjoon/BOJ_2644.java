package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Solved
 */
// https://www.acmicpc.net/problem/2644
public class BOJ_2644 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int person1 = sc.nextInt();
        int person2 = sc.nextInt();
        int m = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        int[] distance = new int[n+1];

        boolean[] visited = new boolean[n+1];
        boolean[][] graph = new boolean[n+1][n+1];

        for (int i = 0; i < m; i++) {
            int p1 = sc.nextInt();
            int p2 = sc.nextInt();

            graph[p1][p2] = true;
            graph[p2][p1] = true;
        }

        queue.add(person1);
        while(!queue.isEmpty()) {
            int current = queue.poll();
            visited[current] = true;

            for (int i = 1; i < graph[current].length; i++) {
                if(graph[current][i] && !visited[i]) {
                    queue.add(i);
                    distance[i] = distance[current] + 1;
                }
            }
        }

        if(distance[person2] != 0)
            System.out.println(distance[person2]);
        else
            System.out.println(-1);
    }
}
