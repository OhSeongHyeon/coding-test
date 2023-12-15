import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] aa = br.readLine().split("\\s");
        String[] ca = br.readLine().split("\\s");
        int ax = Integer.parseInt(aa[0]);
        int ay = Integer.parseInt(aa[1]);
        int az = Integer.parseInt(aa[2]);
        int cx = Integer.parseInt(ca[0]);
        int cy = Integer.parseInt(ca[1]);
        int cz = Integer.parseInt(ca[2]);
        System.out.printf("%d %d %d", cx-az, cy/ay, cz-ax);
    }

}