import java.io.*;
import java.util.*;

public class Main {
	
	private static int[][] dp = new int[30][30];
	
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int tc = Integer.parseInt(br.readLine());
    	StringBuilder sb = new StringBuilder();
    	StringTokenizer st;
    	
    	for (int i = 0; i < tc; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			sb.append(comb(m, n)).append("\n");
		}
    	
    	System.out.println(sb);
    }

	private static int comb(int n, int r) {
		if(dp[n][r] > 0) {
			return dp[n][r]; 
		}
		
		if(n == r || r == 0) {
			return dp[n][r] = 1;
		}
		
		return dp[n][r] = comb(n - 1, r - 1) + comb(n - 1, r);
	}
    
}