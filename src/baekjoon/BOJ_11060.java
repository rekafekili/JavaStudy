package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// https://www.acmicpc.net/problem/11060
public class BOJ_11060 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int testCase = Integer.parseInt(str);
        int[] miro = new int[testCase];

        str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        String[] arr = str.split(" ");

        for (int i = 0; i < testCase; i++) {
            miro[i] = Integer.parseInt(arr[i]);
        }

        Stack<Integer> stack = new Stack<>(); // 차선책들
        ArrayList<Integer> route = new ArrayList<>(); // 지나온 곳들

        int position = 0;
        while (true) {
            if (miro[position] != 0) {
                route.add(position);
                stack.clear();

                List<Integer> list = new ArrayList<>();
                for (int i = 1; i <= miro[position]; i++) {
                    try {
                        list.add(miro[position + i]);
                    } catch (ArrayIndexOutOfBoundsException ignored) {
                        break;
                    }
                }

                Collections.sort(list);
                for(int tmp : list) {
                    stack.push(tmp);
                }

                position = stack.pop();
            } else if(position + miro[position] >= testCase) {
                System.out.println(route.size());
                return;
            } else {
                if(stack.empty()) {
                    System.out.println(-1);
                    return;
                }
                position = stack.pop();
            }
        }
    }
}
