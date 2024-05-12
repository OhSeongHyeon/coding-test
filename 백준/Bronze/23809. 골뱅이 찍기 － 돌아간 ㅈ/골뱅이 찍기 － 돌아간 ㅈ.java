import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int len = 5 * n;
		
		for (int i = 0; i < len; i++) {
			int o = i/n + 1;
			String a = "@".repeat(n);
			String s = " ".repeat(n);
			sb.append(a);
			if(o%2 == 0) {
				sb.append(s.repeat(2));
			}else if(o == 3) {
				sb.append(a);
			}else {
				sb.append(s.repeat(3));
			}
			sb.append(a).append("\n");
		}
		
		System.out.println(sb);
	}

}