package bigo.session.third;

import java.util.*;

public class Problem551A {
    static class Pair {
        int index;
        int value;

        public Pair(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Pair> pairs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Pair pair = new Pair(i, sc.nextInt());
            pairs.add(pair);
        }

        Collections.sort(pairs, ((o1, o2) -> o2.value - o1.value));

        int result[] = new int[n];
        int position = 1;
        int buff = 1;
        result[pairs.get(0).index] = position;
        for (int i = 1; i < n; i++) {
            if (pairs.get(i).value != pairs.get(i - 1).value) {
                position += buff;
                buff = 1;
            } else {
                buff++;
            }

            result[pairs.get(i).index] = position;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
