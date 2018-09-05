package bigo.session.second;

import java.util.Scanner;

public class Problem387B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int nComplexities[] = new int[n];
        int mComplexities[] = new int[m];

        for (int i = 0 ; i < n; i++) {
            nComplexities[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            mComplexities[i] = sc.nextInt();
        }

        int solved = 0;
        int j = 0;

        for (int i = 0; i < n; i++) {
            while (j < m) {
                if (nComplexities[i] <= mComplexities[j++]) {
                    solved++;
                    break;
                }
            }
        }

        System.out.println(n - solved);
    }
}
