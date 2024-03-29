import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int len = n + 2;
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= len; i++) {
			sb.append("@");
			sb.append((i == 1 || i == len ? "@" : " ").repeat(n));
			sb.append("@\n");
		}
		
		System.out.println(sb);
	}

}