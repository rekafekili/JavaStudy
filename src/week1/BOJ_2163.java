package week1;

import java.util.Scanner;

public class BOJ_2163 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = (a-1) + a*(b-1);
        System.out.println(result);
    }
}