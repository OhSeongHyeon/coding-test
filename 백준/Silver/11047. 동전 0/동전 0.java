import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().split("\\s");
		int n = Integer.parseInt(sp[0]);
		int k = Integer.parseInt(sp[1]);
		int[] coins = new int[n];
		int idx = 0;
		int res = 0;
		
		for (int i = 0; i < n; i++) {
			coins[i] = Integer.parseInt(br.readLine());
			if(k >= coins[i]) {
				idx = Math.max(idx, i);
			}
		}
		
		for (int i = idx; i >= 0 && k > 0; i--) {
			if(k >= coins[i]) {
				res += k/coins[i];
				k %= coins[i];
			}
		}
		
		System.out.println(res);
	}

}