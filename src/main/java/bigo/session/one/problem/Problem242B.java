package bigo.session.one.problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem242B {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int nSegments = sc.nextInt();
        List<Integer> aLeft = new ArrayList<>();
        List<Integer> aRight = new ArrayList<>();

        for (int i = 0; i < nSegments; i++) {
            aLeft.add(sc.nextInt());
            aRight.add(sc.nextInt());
        }

        int iMin = 0;
        int iMax = 0;
        int min = aLeft.get(iMin);
        int max = aRight.get(iMax);

        for (int i = 1; i < nSegments; i++) {
            if (min > aLeft.get(i)) {
                min = aLeft.get(i);
                iMin = i;
            }

            if (max < aRight.get(i)) {
                max = aRight.get(i);
                iMax = i;
            }

            if (min == aLeft.get(i) && max <= aRight.get(i) || max == aRight.get(i) && min >= aLeft.get(i)) {
                min = aLeft.get(i);
                max = aRight.get(i);
                iMin = iMax = i;
            }
        }

        if (iMin == iMax) {
            System.out.println(iMax + 1);
        } else {
            System.out.println(-1);
        }

    }
}
