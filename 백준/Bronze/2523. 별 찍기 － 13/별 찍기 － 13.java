import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int len = n*2-1;
		
		for (int i = 1; i <= len; i++) {
			sb.append("*".repeat(i <= n ? i : i-((i-n)*2))).append("\n");
		}
		
		System.out.println(sb);
	}

}