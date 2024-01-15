import java.io.*;
import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger a = new BigInteger(br.readLine());
		String op = br.readLine();
		BigInteger b = new BigInteger(br.readLine());
		System.out.println("*".equals(op) ? a.multiply(b) : a.add(b));
	}
	
}