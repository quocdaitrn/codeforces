package bigo.session.fifth;

import java.util.Scanner;

public class Problem731A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int sum = 0, diff;

        int n = s.length();
        int currentPosition = 'a';

        for (int i = 0; i < n; i++) {
            diff = Math.abs(currentPosition - s.charAt(i));
            sum += (diff <= 13) ? diff : (26 - diff);
            currentPosition = s.charAt(i);
        }

        System.out.print(sum);
    }
}
