package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BOJ_4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            ArrayList<Integer> numbers = new ArrayList<>();

            for (int i = 0; i < 3; i++) {
                int input = sc.nextInt();
                if (input != 0) {
                    numbers.add(input);
                }
            }

            if(numbers.isEmpty()) {
                break;
            } else {
                if(isRightTriangle(numbers)) {
                    System.out.println("right");
                } else {
                    System.out.println("wrong");
                }
            }
        }
    }

    private static boolean isRightTriangle(ArrayList<Integer> numbers) {
        Collections.sort(numbers);

        int a = numbers.get(0);
        int b = numbers.get(1);
        int c = numbers.get(2);

        if( a + b >= c ) {

        } else {
            return false
        }
    }
}
