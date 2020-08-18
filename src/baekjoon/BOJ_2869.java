package baekjoon;

import java.io.*;
import java.util.Scanner;

public class BOJ_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int A = Integer.parseInt(input.split(" ")[0]);
        int B = Integer.parseInt(input.split(" ")[1]);
        int V = Integer.parseInt(input.split(" ")[2]);

        int day;
        if(V==A) {
            day = 1;
        } else {
            day = V-B;

        }

        bw.write("" + day);
        bw.flush();
    }
}
