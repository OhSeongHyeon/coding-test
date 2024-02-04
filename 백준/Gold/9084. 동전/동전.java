import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(br.readLine());
		
		while(tc-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int[] coins = createCoinKindArray(n, br.readLine());
			int m = Integer.parseInt(br.readLine());

		    int[] dp = new int[m + 1];
		    dp[0] = 1;

		    for (int coin : coins) {
		        for (int i = coin; i <= m; i++) {
		            dp[i] += dp[i - coin];
		        }
		    }

		    sb.append(dp[m]).append("\n");
		}
		
		System.out.println(sb);
    }

	private static int[] createCoinKindArray(int n, String s) {
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(s);
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		return arr;
	}

}