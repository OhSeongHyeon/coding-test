import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int len = 5 * n;
		
		for (int i = 1; i <= len; i++) {
			if(i <= len - n) {
				sb.append("@".repeat(n));
			}else {
				sb.append("@".repeat(len));
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}

}