import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= t; i++) {
			int n = Integer.parseInt(br.readLine());
			sb.append(n).append(" ").append(n).append("\n");
		}
		
		System.out.println(sb);
	}

}