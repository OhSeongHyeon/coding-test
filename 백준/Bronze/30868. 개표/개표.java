import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= t; i++) {
			int vn = Integer.parseInt(br.readLine());
			for (int j = 0; j < vn/5; j++) {
				sb.append("++++ ");
			}
			for (int j = 0; j < vn%5; j++) {
				sb.append("|");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}

}