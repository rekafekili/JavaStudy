package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Solved
 */

// https://www.acmicpc.net/problem/1931
public class BOJ_1931 {
    private static class Meeting {
        private int start;
        private int end;

        public Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public int getEnd() {
            return end;
        }

        public void setEnd(int end) {
            this.end = end;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();
        ArrayList<Meeting> meetingList = new ArrayList<>();

        for (int i = 0; i < testCase; i++) {
            meetingList.add(new Meeting(sc.nextInt(), sc.nextInt()));
        }

        meetingList.sort((o1, o2) -> {
            if(o1.getEnd() == o2.getEnd()) {
                return o1.getStart() - o2.getStart();
            } else {
                return o1.getEnd() - o2.getEnd();
            }
        });

        int result = 0;
        int lastTime = 0;

        for (int i = 0; i < meetingList.size(); i++) {
            if(i == 0) {
                result++;
                lastTime = meetingList.get(i).getEnd();
            } else {
                Meeting thisMeeting = meetingList.get(i);
                if(thisMeeting.getStart() >= lastTime) {
                    result++;
                    lastTime = thisMeeting.getEnd();
                }
            }
        }

        System.out.println(result);
    }
}
