import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int len = n*2-1;
		
		for (int i = 1; i <= len; i++) {
			boolean toggle = i <= n;
			sb.append(" ".repeat(toggle ? n-i : i-n))
				.append("*".repeat(toggle ? i : i-(i-n)*2))
				.append("\n");
		}
		
		System.out.println(sb);
	}
	
}