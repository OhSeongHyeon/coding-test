import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        String ss = "1".repeat(k) + "0".repeat(k - 1);
        System.out.println(ss);
    }
	
}