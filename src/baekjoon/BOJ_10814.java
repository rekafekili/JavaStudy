package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Solved
 */

// https://www.acmicpc.net/problem/10814
class Member {
    public int order; // 가입한 순서
    public int age; // 나이
    public String name; // 이름

    Member(int order, int age, String name) {
        this.order = order;
        this.age = age;
        this.name = name;
    }
}

public class BOJ_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int members = Integer.parseInt(br.readLine());
        ArrayList<Member> memberlist = new ArrayList<>();

        for (int i = 0; i < members; i++) {
            String input = br.readLine();
            int age = Integer.parseInt(input.split(" ")[0]);
            String name = input.split(" ")[1];
            memberlist.add(new Member(i, age, name));
        }

        memberlist.sort((Member m1, Member m2) -> {
            if (m1.age != m2.age) {
                return m1.age - m2.age;
            } else {
                return m1.order - m2.order;
            }
        });

        for (Member m : memberlist) {
            System.out.println(m.age + " " + m.name);
        }
    }
}
