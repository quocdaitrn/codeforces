package bigo.session.two.problem;

import java.util.Scanner;

public class Problem224B {

    public static final int MAX = 111111;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[MAX];

        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        int kCount = 0;

        int j = 0;

        int[] arrCount = new int[MAX];

        for (int i = 1; i <= n; i++) {
            arrCount[arr[i]]++;
            if (arrCount[arr[i]] == 1) {
                kCount++;
            }

            while (kCount == k) {
                j++;
                arrCount[arr[j]]--;
                if (arrCount[arr[j]] == 0) {
                    System.out.printf("%d %d", j, i);
                    return;
                }
            }
        }

        System.out.println("-1 -1");
    }
}
