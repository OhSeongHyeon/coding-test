import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(new java.math.BigInteger(br.readLine(), 2).toString(8));
	}
}