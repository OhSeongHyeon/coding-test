import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        System.out.printf("%d", factorial(n) / (factorial(k) * factorial(n - k)));
    }

    private static int factorial(int n) {
        if(n == 0) return 1;
        return n * factorial(--n);
    }
}