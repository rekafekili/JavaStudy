package baekjoon;

import java.util.LinkedList;
import java.util.Scanner;

// https://www.acmicpc.net/problem/5214
public class BOJ_5214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int station = sc.nextInt();
        int hyperTubeStation = sc.nextInt();
        int hyperTube = sc.nextInt();

        boolean[][] connectTable = new boolean[station + 1][station + 1];
        boolean[] visited = new boolean[station + 1];
        int[] distance = new int[station + 1];
        LinkedList<Integer> queue = new LinkedList<>();

        for (int i = 0; i < hyperTube; i++) {
            int first = sc.nextInt();
            int second = sc.nextInt();
            int third = sc.nextInt();

            connectTable[first][second] = true;
            connectTable[first][third] = true;
            connectTable[second][first] = true;
            connectTable[second][third] = true;
            connectTable[third][first] = true;
            connectTable[third][second] = true;
        }

        queue.add(1);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            visited[current] = true;

            for (int i = 1; i < connectTable[current].length; i++) {
                if (connectTable[current][i] && !visited[i]) {
                    queue.add(i);
                    if (distance[i] == 0)
                        distance[i] = distance[current] + 1;
                    else
                        distance[i] = Math.min(distance[i], distance[current] + 1);
                }
            }
        }

        System.out.println(distance[station] + 1);
    }
}