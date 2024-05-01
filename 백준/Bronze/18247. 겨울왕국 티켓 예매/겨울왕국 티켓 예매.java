import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int ln = 'l' - 'a' + 1;
		
		while(t-- > 0) {
			String[] sp = br.readLine().split("\\s");
			int n = Integer.parseInt(sp[0]);
			int m = Integer.parseInt(sp[1]);
			sb.append(n < ln || m < 4 ? "-1" : (ln - 1) * m + 4).append("\n");
		}
		
		System.out.println(sb);
	}
	
}