import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= 5; i++) {
			if(i == 1 || i == 5) {
				for (int j = 0; j < n; j++) {
					sb.append("@".repeat(5*n));
					sb.append("\n");
				}
			}else {
				for (int j = 0; j < n; j++) {
					sb.append("@".repeat(n));
					sb.append(" ".repeat(3*n));
					sb.append("@".repeat(n));
					sb.append("\n");
				}
			}
		}
		
		System.out.println(sb);
	}

}