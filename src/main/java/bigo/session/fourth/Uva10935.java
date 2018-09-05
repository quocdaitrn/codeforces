package bigo.session.fourth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Uva10935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while (!(s = br.readLine()).equals("0")) {
            int n = Integer.parseInt(s);

            Queue<Integer> arr = new LinkedList<>();
            Queue<Integer> throwArr = new LinkedList<>();

            for (int i = 1; i <= n; i++) {
                arr.offer(i);
            }

            while(arr.size() >= 2) {
                throwArr.offer(arr.poll());
                arr.offer(arr.poll());
            }

            StringBuffer sb = new StringBuffer();
            sb.append("Discarded cards:");
            if (throwArr.size() > 0) {
                sb.append(" ");
            }

            while (throwArr.size() > 0) {
                sb.append(throwArr.poll());
                if (throwArr.size() > 0) {
                    sb.append(", ");
                }
            }
            sb.append("\nRemaining card:");
            if (arr.size() > 0) {
                sb.append(arr.poll());
            }

            System.out.println(sb.toString());
        }
    }
}
