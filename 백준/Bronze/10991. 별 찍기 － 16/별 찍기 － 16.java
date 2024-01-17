import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= n; i++) {
			sb.append(" ".repeat(n-i));
			sb.append("*");
			if(i > 1) {
				int innerLen = (i-1)*2;
				for (int j = 1; j <= innerLen; j++) {
					sb.append(j%2 == 0 ? "*" : " ");
				}
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}

}