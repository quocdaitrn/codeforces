package bigo.session.first;

import java.util.Arrays;
import java.util.Scanner;

public class Problem691A {

    public static void main(String args[]) {
        Problem691A obj = new Problem691A();
        obj.solve();
    }

    private void solve() {
        Scanner sc = new Scanner(System.in);

        // Solve problem
        String result = "YES";
        int totalButton = Integer.valueOf(sc.nextLine());
        String sButtonsStatus = sc.nextLine().trim();
        String[] aButtonsStatus = sButtonsStatus.split(" ");

        if (totalButton == 1) {
            if ("0".equals(aButtonsStatus[0])) {
                result = "NO";
            }
        } else {
            String sTotal = Arrays.asList(aButtonsStatus).stream().reduce((a, b)
                    -> String.valueOf(Integer.parseInt(a) + Integer.parseInt(b))).get();

            int abs = Math.abs(Integer.parseInt(sTotal) - totalButton);
            if (abs != 1) {
                result = "NO";
            }
        }

        System.out.println(result);
    }
}
