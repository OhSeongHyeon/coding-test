import java.io.*;
import java.math.BigInteger;

public class Main {
	
	private static BigInteger[] memo;
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        memo = new BigInteger[n + 1];
        memo[0] = BigInteger.ZERO;
		if(n > 0) memo[1] = BigInteger.ONE;
        System.out.println(fib(n));
    }
	
	private static BigInteger fib(int n) {
		if(memo[n] != null) {
			return memo[n];
		}
		memo[n] = fib(n-1).add(fib(n-2));
		return memo[n];
	}

}