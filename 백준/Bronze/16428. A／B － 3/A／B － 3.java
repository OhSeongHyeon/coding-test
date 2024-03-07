import java.io.*;
import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().split("\\s");
		BigInteger a = new BigInteger(sp[0]);
		BigInteger b = new BigInteger(sp[1]);
		System.out.printf("%s\n%s", a.divide(b), a.remainder(b));
	}

}