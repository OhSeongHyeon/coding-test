import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().split(" ");
		int n = Integer.parseInt(sp[0]);
		int m = Integer.parseInt(sp[1]);
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			sb.append(n);
			if(sb.length() >= m) {
				sb.setLength(m);
				break;
			}
		}
		
		System.out.println(sb);
	}
	
}