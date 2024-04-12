import java.io.*;

public class Main {
	
	private static final int[] memo = new int[301];
	
	static {
		int s = 0;
		for (int i = 1; i < memo.length; i++) {
			s += i * ((i+1)*(i+2)/2);
			memo[i] = s;
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			sb.append(memo[n]).append("\n");
		}
		
		System.out.println(sb);
	}

}