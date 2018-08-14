package bigo.session.one.problem;

import java.util.Scanner;

public class Problem677A {
    public static void main(String args[]) {
        int roadWith = 0;

        Scanner sc = new Scanner(System.in);

        int persons = sc.nextInt();
        int wallHeight = sc.nextInt();

        int count = 1;

        while (count <= persons && sc.hasNextInt()) {
            if (sc.nextInt() > wallHeight) {
                roadWith += 2;
            } else {
                roadWith += 1;
            }

            count++;
        }

        System.out.println(roadWith);
    }
}
