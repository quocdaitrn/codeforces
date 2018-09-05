package bigo.session.first;

import java.util.Scanner;

public class Problem609B {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] books = new int[n];
        int[] booksByGenre = new int[m];
        for (int i = 0; i < n; i++) {
            books[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            booksByGenre[books[i] - 1]++;
        }

        int result = 0;

        for (int i = 0; i < m - 1; i++) {
            for (int j = i + 1; j < m; j++) {
                result += booksByGenre[i] * booksByGenre[j];
            }
        }

        System.out.println(result);
    }
}
