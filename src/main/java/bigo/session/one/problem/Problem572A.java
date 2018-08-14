package bigo.session.one.problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem572A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int numOfElementsInA = sc.nextInt();
        int numOfElementsInB = sc.nextInt();

        int k = sc.nextInt();
        int m = sc.nextInt();

        if (k > numOfElementsInA || m > numOfElementsInB) {
            System.out.println("NO");
            return;
        }

        List<Integer> aA = new ArrayList<>();
        List<Integer> aB = new ArrayList<>();

        for (int i = 0; i < numOfElementsInA; i++) {
            aA.add(sc.nextInt());
        }

        for (int i = 0; i < numOfElementsInB; i++) {
            aB.add(sc.nextInt());
        }

        if (aA.get(k - 1) < aB.get(aB.size() - m)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
