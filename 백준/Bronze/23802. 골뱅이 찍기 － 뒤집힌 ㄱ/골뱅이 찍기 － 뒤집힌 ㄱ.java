import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int len = t * 5;
		
		for (int i = 0; i < len; i++) {
			if(i < t) {
				sb.append("@".repeat(len));
			}else {
				sb.append("@".repeat(t));
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}

}