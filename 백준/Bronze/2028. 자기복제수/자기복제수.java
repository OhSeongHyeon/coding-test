import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while(t-- > 0) {
			String in = br.readLine();
			int nLen = in.length();
			int n = Integer.parseInt(in);
			int lstNum =  (n * n) % (int) Math.pow(10, nLen);
			sb.append(n == lstNum ? "YES\n" : "NO\n");
		}
		
		System.out.println(sb);
	}
	
}