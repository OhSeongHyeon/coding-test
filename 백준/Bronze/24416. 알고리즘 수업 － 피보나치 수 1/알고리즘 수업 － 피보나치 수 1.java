import java.io.*;

public class Main {
	private static int cd1 = 0;
	private static int cd2 = 0;
	private static int[] memo;
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        memo = new int[n+1];
        memo[0] = memo[1] = 1;
        fib(n);
        fibonacci(n);
        System.out.printf("%d %d", cd1, cd2);
    }

	private static int fib(int n) {
		if(n == 1 || n == 2) {
			cd1++;
			return 1;
		}
		return (fib(n-1) + fib(n-2));
	}
	
	private static int fibonacci(int n) {
		for (int i = 2; i < n; i++) {
			cd2++;
			memo[i] = memo[i-1] + memo[i-2];
		}
		return memo[n-1];
	}
}