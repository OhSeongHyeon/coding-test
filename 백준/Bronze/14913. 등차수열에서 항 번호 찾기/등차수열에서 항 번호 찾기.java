import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sp = br.readLine().split("\\s");
        int a = Integer.parseInt(sp[0]);
        int d = Integer.parseInt(sp[1]);
        int k = Integer.parseInt(sp[2]);
        if ((k - a) % d == 0) {
            int n = (k - a) / d + 1;
            System.out.println(n > 0 ? n : "X");
        } else {
            System.out.println("X");
        }
    }

}