import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		while(t-- > 0) {
			int len = Integer.parseInt(br.readLine());
			String[] sp = br.readLine().split("\\s");
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			
			for (int i = 0; i < len; i++) {
				int n = Integer.parseInt(sp[i]);
				min = Math.min(min, n);
				max = Math.max(max, n);
			}
			
			sb.append(min).append(" ").append(max).append("\n");
		}
		
		System.out.println(sb);
	}
	
}