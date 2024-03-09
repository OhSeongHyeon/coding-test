import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while(t-- > 0) {
			int s = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			
			while(n-- > 0) {
				String[] sp = br.readLine().split("\\s");
				int q = Integer.parseInt(sp[0]);
				int p = Integer.parseInt(sp[1]);
				s += q*p;
			}
			
			sb.append(s).append("\n");
		}
		
		System.out.println(sb);
	}

}