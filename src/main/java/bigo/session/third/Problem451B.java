package bigo.session.third;

import java.util.Arrays;
import java.util.Scanner;

public class Problem451B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = a[i];
        }

        Arrays.sort(b);

        int i, l = 0, r = 0;
        for (i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                l = i;
                break;
            }
        }

        for (i = a.length - 1; i >= 0; i--) {
            if (a[i] != b[i]) {
                r = i;
                break;
            }
        }

        int k = 0;
        for (i = l; i <= (l + r) / 2; i++) {
            int temp = a[i];
            a[i] = a[r - k];
            a[r - k] = temp;
            k++;
        }

        for (i = 0; i < n - 1; i++) {
            if (a[i] > a[i+1]) {
                System.out.print("no");
                break;
            }
        }

        if (i == n - 1) {
            System.out.println("yes");
            System.out.print((l + 1) + " " + (r + 1));
        }
    }
}
