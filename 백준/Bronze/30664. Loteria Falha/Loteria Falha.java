import java.io.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input;
		
		while((input = br.readLine()) != null && !input.equals("0")) {
			BigInteger bi = new BigInteger(input);
			sb.append(bi.mod(BigInteger.valueOf(42)).equals(BigInteger.ZERO) ? "PREMIADO\n" : "TENTE NOVAMENTE\n");
		}
		
		System.out.println(sb);
    }
}