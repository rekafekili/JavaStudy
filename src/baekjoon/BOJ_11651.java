package baekjoon;

import java.util.*;

/**
 * Solved
 */

// https://www.acmicpc.net/problem/11651
class Point {
    public int x;
    public int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class BOJ_11651 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();
        ArrayList<Point> points = new ArrayList<>();

        for (int i = 0; i < testCase; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            points.add(new Point(x, y));
        }

        Collections.sort(points, new Comparator<Point>() {
            @Override
            public int compare(Point p1, Point p2) {
                if(p1.y == p2.y) {
                    return p1.x - p2.x;
                } else {
                    return p1.y - p2.y;
                }
            }
        });

        for (int i = 0; i < testCase; i++) {
            System.out.println(points.get(i).x + " " + points.get(i).y);
        }
    }
}
