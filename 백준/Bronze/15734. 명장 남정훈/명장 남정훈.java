import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sp = br.readLine().split("\\s");
        int l = Integer.parseInt(sp[0]);
        int r = Integer.parseInt(sp[1]);
        int a = Integer.parseInt(sp[2]);

        if (l == r) {
            System.out.println(l + r + (a / 2) * 2);
            return;
        }

        int abs = Math.abs(l - r);
        System.out.println((a <= abs) ? ((Math.min(l, r) + a) * 2) : ((Math.max(l, r) + (a - abs) / 2) * 2));
    }

}