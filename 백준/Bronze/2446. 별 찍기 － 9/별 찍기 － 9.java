import java.io.*;

// https://www.acmicpc.net/problem/2446
public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int len = n*2 - 1;
		
		for (int i = 0; i < len; i++) {
			sb.append(" ".repeat(i < n ? i : len-i-1));
			sb.append("*".repeat(i < n ? len-i*2 : 3 + (i-n) + (i-n)));
			sb.append("\n");
		}
		
		System.out.println(sb);
	}

}