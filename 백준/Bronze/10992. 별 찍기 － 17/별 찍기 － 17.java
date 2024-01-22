import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder(" ".repeat(n-1))
				.append("*")
				.append("\n");
		
		for (int i = 2; i < n; i++) {
			sb.append(" ".repeat(n-i))
				.append("*")
				.append(" ".repeat((i-1)*2-1))
				.append("*")
				.append("\n");
		}
		
		System.out.println(sb.append(n == 1 ? "" : "*".repeat(n*2-1)));
	}

}