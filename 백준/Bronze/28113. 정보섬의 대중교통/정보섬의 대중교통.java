import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sp = br.readLine().split("\\s");
        int a = Integer.parseInt(sp[1]);
        int b = Integer.parseInt(sp[2]);
        System.out.println(a <= b ? a == b ? "Anything" : "Bus" : "Subway");
    }

}