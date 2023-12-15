import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sp = br.readLine().split("\\s");
        int a = Integer.parseInt(sp[0]);
        int b = Integer.parseInt(sp[1]);
        int c = Integer.parseInt(sp[2]);
        System.out.println(b/a*3*c);
    }

}