import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        long n = Long.parseLong(br.readLine());

        for (long a = 1; a * a <= n; a++) {
            if (n % a == 0) {
                long b = n / a;
                cnt++;
                if (a != b) cnt++;
            }
        }

        System.out.println(cnt);
    }
}