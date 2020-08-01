package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Solved
 */

// https://www.acmicpc.net/problem/7568
class Person {
    public int weight;
    public int height;

    Person(int w, int h) {
        this.weight = w;
        this.height = h;
    }
}

public class BOJ_7568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int members = sc.nextInt();
        ArrayList<Person> persons = new ArrayList<>();
        int[] rankings = new int[members];

        for (int i = 0; i < members; i++) {
            int weight = sc.nextInt();
            int height = sc.nextInt();
            Person p = new Person(weight, height);
            persons.add(p);
        }

        for (int i = 0; i < persons.size(); i++) {
            for (int j = 0; j < persons.size(); j++) {
                if (i != j) {
                    if (persons.get(j).weight > persons.get(i).weight && persons.get(j).height > persons.get(i).height) {
                        rankings[i]++;
                    }
                }
            }
        }

        for (int ranking : rankings) {
            System.out.print((ranking + 1) + " ");
        }
    }
}
