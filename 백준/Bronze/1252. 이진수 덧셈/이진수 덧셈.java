import java.io.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().split(" ");
		BigInteger a = new BigInteger(sp[0], 2);
		BigInteger b = new BigInteger(sp[1], 2);
		System.out.println(a.add(b).toString(2));
	}
	
}