import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Main obj = new Main();
        obj.solve();
    }

    private void solve() {
        Scanner sc = new Scanner(System.in);
        OutputStream outputStream = System.out;
        PrintWriter out = new PrintWriter(outputStream);

        // Solve problem
        String result = "YES";
        int totalButton = Integer.valueOf(sc.nextLine());
        String sButtonsStatus = sc.nextLine().trim();
        String[] aButtonsStatus = sButtonsStatus.split(" ");

        if (totalButton == 1) {
            if ("0".equals(aButtonsStatus[0])) {
                result = "NO";
            }
        } else {
            if ("0".equals(aButtonsStatus[totalButton - 1])) {
                result = "NO";
            }

            String sTotal = Arrays.asList(aButtonsStatus).stream().reduce((a, b)
                    -> String.valueOf(Integer.parseInt(a) + Integer.parseInt(b))).get();

            int abs = Math.abs(Integer.parseInt(sTotal) - totalButton);
            if (abs != 1) {
                result = "NO";
            }
        }

        out.println(result);
    }
}
