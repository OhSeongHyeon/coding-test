import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        int m = n / 3;

        for (int x = 1; x <= m; x++) {
            for (int y = 1; y <= m; y++) {
                if (m - x - y > 0) count++;
            }
        }

        System.out.println(count);
    }
}