package week1;

import java.util.Scanner;

// https://www.acmicpc.net/problem/6359
public class BOJ_6359 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; i++) {
            int room = sc.nextInt();

            boolean[] isClosed = new boolean[room+1];

            for (int j = 2; j <= room; j++) {
                for(int k = j; k <= room; k += k) {
                    isClosed[k] = !isClosed[k];
                }
            }

            int result = 0;

            for(int h = 0; h < testCase; h++) {
                if(!isClosed[h])
                    result++;
            }

            System.out.println(result);
        }
    }
}
