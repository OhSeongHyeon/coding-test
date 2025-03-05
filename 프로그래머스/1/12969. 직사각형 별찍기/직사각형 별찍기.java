import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sp = br.readLine().split("\\s");
        int hStar = Integer.parseInt(sp[0]);
        int vStar = Integer.parseInt(sp[1]);
        StringBuilder sb = new StringBuilder();
        while (vStar-- > 0) sb.append("*".repeat(hStar)).append("\n");
        System.out.print(sb);
    }

}