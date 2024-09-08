import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringBuilder res = new StringBuilder();
		
		while(n-- > 0) {
			String org = br.readLine().toLowerCase();
			String rev = res.append(org).reverse().toString();
			sb.append(org.equals(rev) ? "Yes\n" : "No\n");
			res.setLength(0);
		}
		
		System.out.println(sb);
	}
	
}