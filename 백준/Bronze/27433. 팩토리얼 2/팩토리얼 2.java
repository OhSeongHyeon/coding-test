import java.io.*;
import java.math.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(fac(n));
	}

	private static BigInteger fac(int n) {
		if(n==0 || n==1) {
			return BigInteger.ONE;
		}
		return BigInteger.valueOf(n).multiply(fac(n-1));
	}

}