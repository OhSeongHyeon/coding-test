import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < n; j++) {
				sb.append("@".repeat(i==1 ? 3*n : n))
					.append(" ".repeat(n))
					.append("@".repeat(i==5 ? 3*n : n));
				if(i >= 2 && i <= 4) {
					sb.append(" ".repeat(n))
					.append("@".repeat(n));
				}
				sb.append("\n");
			}
		}
		
		System.out.println(sb);
	}

}