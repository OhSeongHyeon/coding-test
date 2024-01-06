import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int week = 60*60*24*7;
		System.out.println(factorial(n)/week);
	}
	
	private static long factorial(int n) {
		if(n <= 1) return 1;
		return n * factorial(--n);
	}

}