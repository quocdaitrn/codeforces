package bigo.session.third;

import java.util.Arrays;
import java.util.Scanner;

public class Problem439B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        Long c[] = new Long[n];

        for (int i = 0; i < n; i++) {
            c[i] = sc.nextLong();
        }

        Arrays.sort(c);

        long totalTime = 0L;
        for (int i = 0; i < n; i++) {
            totalTime += c[i] * x;
            if (x > 1) {
                x--;
            }
        }

        System.out.print(totalTime);
    }
}