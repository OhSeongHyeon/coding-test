import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int UR = Integer.parseInt(input[0]);
        int TR = Integer.parseInt(input[1]);
        int UO = Integer.parseInt(input[2]);
        int TO = Integer.parseInt(input[3]);
        int siteScore = 56 * UR + 24 * TR + 14 * UO + 6 * TO;
        System.out.println(siteScore);
    }
}
