import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int res = calcSum(n);
		
		sb.append(res).append("\n")
			.append(res*res).append("\n")
			.append((int) calcSum(n, 3));
		
		System.out.println(sb);
    }
	
	private static double calcSum(int n, int exponent) {
		if(n == 1) return 1;
		return Math.pow(n, exponent) + calcSum(--n, exponent);
	}
	
	private static int calcSum(int n) {
		return (int) calcSum(n, 1);
	}
}