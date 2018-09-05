package bigo.session.fourth;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class SpojStpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }

            int a[] = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Queue<Integer> mainQueue = new LinkedList<>();
            Stack<Integer> branchStack = new Stack<>();

            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    branchStack.push(a[i]);
                } else {
                    mainQueue.offer(a[i]);
                }
            }

            mainQueue.offer(a[n - 1]);

            int result[] = new int[n];
            int k = 0;
            while (mainQueue.size() > 0) {
                result[k] = mainQueue.poll();
                k++;
            }

            while (!branchStack.isEmpty()) {
                result[k] = branchStack.pop();
                k++;
            }

            int index = 0;
            for (; index < n - 1; index++) {
                if (result[index] > result[index + 1]) {
                    System.out.print("no");
                    break;
                }
            }

            if (index == n - 1) {
                System.out.print("yes");
            }
        }
    }
}
