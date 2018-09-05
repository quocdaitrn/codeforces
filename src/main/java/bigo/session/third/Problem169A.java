package bigo.session.third;

import java.util.Arrays;
import java.util.Scanner;

public class Problem169A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int h[] = new int[n];

        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        Arrays.sort(h);

        int k = 0;
        int result = 0;

        for (int i = n - 1; i >= 0; i--) {
            k++;
            if (k <= n && k == a) {
                result = h[i] - h[i - 1];
                break;
            }
        }


        System.out.println(result);
    }
}
