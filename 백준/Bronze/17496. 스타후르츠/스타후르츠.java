import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sp = br.readLine().split("\\s");
        int n = Integer.parseInt(sp[0]);
        int t = Integer.parseInt(sp[1]);
        int c = Integer.parseInt(sp[2]);
        int p = Integer.parseInt(sp[3]);
        System.out.println((n-1)/t * c * p);
    }

}