import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        int trg = 1;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        while (trg < n || idx < n) {
            if (arr[idx] >= trg) {
                stack.push(trg++);
                sb.append("+\n");
            } else if (arr[idx] == stack.peek()) {
                stack.pop();
                sb.append("-\n");
                idx++;
            } else {
                System.out.println("NO");
                return;
            }
        }

        System.out.println(sb);
    }

}
