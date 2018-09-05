package bigo.session.second;

import java.util.Scanner;

public class Problem279B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();

        int j = 0, count = 0, vmax = 0;

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {

            while (t < a[i]) {
                t += a[j++];
                count--;
            }

            t -= a[i];
            count++;

            vmax = Math.max(vmax, count);
        }

        System.out.print(vmax);
    }
}
