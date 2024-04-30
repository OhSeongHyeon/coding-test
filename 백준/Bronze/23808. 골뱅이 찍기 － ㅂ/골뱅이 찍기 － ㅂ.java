import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int len = 5 * n;
		
		for (int i = 0; i < len; i++) {
			int ln = i/n + 1;
			String mid = ln == 3 || ln == 5 ? "@" : " ";
			sb.append("@".repeat(n))
				.append(mid.repeat(n*3))
				.append("@".repeat(n))
				.append("\n");
		}
		
		System.out.println(sb);
	}
	
}