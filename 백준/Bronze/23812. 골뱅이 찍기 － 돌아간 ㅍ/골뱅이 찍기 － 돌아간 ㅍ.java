import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int len = 5 * n;

		for (int i = 0; i < len; i++) {
			sb = (i/n + 1)%2 != 0 ? appendStr(sb, " ", n) : appendStr(sb, "@", n);
		}
		
		System.out.println(sb);
	}
	
	private static StringBuilder appendStr(StringBuilder sb, String mid, int r) {
		return sb.append("@".repeat(r))
				.append(mid.repeat(3*r))
				.append("@".repeat(r))
				.append("\n");
	}

}