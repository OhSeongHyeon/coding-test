import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        String[] sp = br.readLine().split("\\s+");
        double d1 = Double.parseDouble(sp[0]);
        double d2 = Double.parseDouble(sp[1]);
        System.out.println(Math.pow(k, 2) - Math.pow((d1-d2)/2, 2));
    }

}