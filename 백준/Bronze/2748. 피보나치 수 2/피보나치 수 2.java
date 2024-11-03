import java.io.*;

public class Main {
	
	private static long[] memo;

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        memo = new long[n + 1];
        memo[0] = 0;
        if (n > 0) memo[1] = 1;
        System.out.println(fibonacci(n));
    }
	
	private static long fibonacci(int n) {
		if(memo[n] != 0 || n == 0) return memo[n];
		memo[n] = fibonacci(n-1) + fibonacci(n-2);
		return memo[n];
	}

}