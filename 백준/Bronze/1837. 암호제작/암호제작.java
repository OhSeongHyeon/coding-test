import java.io.*;
import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().split("\\s");
		BigInteger P = new BigInteger(sp[0]);
		BigInteger k = new BigInteger(sp[1]);
		BigInteger len = P.sqrt();
		
		for (BigInteger i = BigInteger.valueOf(2); i.compareTo(len) != 1; i = i.add(BigInteger.ONE)) {
			boolean state = i.compareTo(k) > -1;
			if(state || P.mod(i).compareTo(BigInteger.ZERO) == 0) {
				System.out.println(state ? "GOOD" : "BAD " + i);
				return;
			}
		}
	}

}