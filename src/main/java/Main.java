import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();

        int[] readTimes = new int[n];

        for (int i = 0; i < n; i++) {
            readTimes[i] = sc.nextInt();
        }

        int j = 0;
        int max = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            while (t < readTimes[i]) {
                t += readTimes[j++];
                count--;
            }

            t -= readTimes[i];
            count++;

            max = Math.max(max, count);
        }

        System.out.println(max);
    }
}