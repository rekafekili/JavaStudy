package baekjoon;

import java.util.Scanner;

public class BOJ_3053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();

        double euclid = Math.PI * Math.pow(r, 2);
        double taxi = 2 * Math.pow(r, 2);

        System.out.printf("%.6f\n", euclid);
        System.out.printf("%.6f", taxi);
    }
}
