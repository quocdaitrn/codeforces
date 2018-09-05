package bigo.session.second;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem161A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int[] soliders = new int[n];
        int[] vests = new int[m];

        for (int i = 0; i < n; i++) {
            soliders[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            vests[i] = sc.nextInt();
        }

        int j = 0;

        Map<Integer, Integer> soliderVestMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (j == m) {
                break;
            }

            while (j < m && vests[j] < soliders[i] - x) {
                j++;
            }

            if (j < m && vests[j] >= soliders[i] - x && vests[j] <= soliders[i] + y) {
                soliderVestMap.put(i + 1, j + 1);
                j++;
            }
        }

        System.out.println(soliderVestMap.size());
        soliderVestMap.entrySet().stream().forEach(e -> {
            System.out.println(e.getKey() + " " + e.getValue());
        });
    }
}
