import java.io.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] split = br.readLine().split("\\s");
		BigInteger n = new BigInteger(split[0]);
		BigInteger m = new BigInteger(split[1]);
		System.out.printf("%s\n%s", n.divide(m), n.mod(m));
    }
}