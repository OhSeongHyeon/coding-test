import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        if (A < B) {
            System.out.println(-1);
        } else if (A == B) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}
