package bigo.session.one.problem;

import java.util.Scanner;

public class Problem673A {
    public static void main(String args[]) {
        int totalMinutes = 0;
        Scanner sc = new Scanner(System.in);

        int beforeMinute = 0;
        int afterMinute = 0;

        int interestedMinutes = sc.nextInt();
        int i = 0;
        for (; i < interestedMinutes; i++) {
            afterMinute = sc.nextInt();
            if (afterMinute - beforeMinute > 15) {
                totalMinutes = beforeMinute + 15;
                break;
            }

            beforeMinute = afterMinute;
        }

        if (i == interestedMinutes) {
            if (90 - afterMinute > 15) {
                totalMinutes = afterMinute + 15;
            } else {
                totalMinutes = 90;
            }
        }

        System.out.println(totalMinutes);
    }
}
