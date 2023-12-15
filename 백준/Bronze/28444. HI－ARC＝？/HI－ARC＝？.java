import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sp = br.readLine().split("\\s");
        int h = Integer.parseInt(sp[0]);
        int i = Integer.parseInt(sp[1]);
        int a = Integer.parseInt(sp[2]);
        int r = Integer.parseInt(sp[3]);
        int c = Integer.parseInt(sp[4]);
        System.out.println(h*i-a*r*c);
    }

}