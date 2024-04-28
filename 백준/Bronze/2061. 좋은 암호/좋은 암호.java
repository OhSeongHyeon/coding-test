import java.io.*;
import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().split("\\s");
		BigInteger k = new BigInteger(sp[0]);
		int l = Integer.parseInt(sp[1]);
		String output = "GOOD";
		
		for (int i = 2; i < l; i++) {
			if(k.mod(BigInteger.valueOf(i)).compareTo(BigInteger.ZERO) == 0) {
				output = "BAD " + i;
				break;
			}
		}
		
		System.out.println(output);
	}
	
}