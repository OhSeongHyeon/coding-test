import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			strAppend(sb, " ", i);
			strAppend(sb, "*", n-i);
			sb.append(i < n ? "\n" : "");
		}
		
		System.out.println(sb);
	}
	
	private static void strAppend(StringBuilder sb, String s, int l) {
		for (int i = 0; i < l; i++) {
			sb.append(s);
		}
	}

}