package week1;

import java.util.Scanner;
import java.util.Stack;

// https://www.acmicpc.net/problem/11047
public class BOJ_11047 {
    public static void main(String[] args) {
        int count = 0;
        Stack<Integer> coin = new Stack<>();
        Scanner sc = new Scanner(System.in);

        int type = sc.nextInt();
        int goal = sc.nextInt();

        for (int i = 0; i < type; i++) {
            coin.push(sc.nextInt());
        }

        while (!coin.empty()) {
            int tmp = coin.pop();
            if (goal / tmp == 0) {
                continue;
            } else if (goal == 0) {
                break;
            } else {
                int c = goal / tmp;
                count += c;
                goal -= tmp * c;
            }
        }

        System.out.println(count);
    }
}
