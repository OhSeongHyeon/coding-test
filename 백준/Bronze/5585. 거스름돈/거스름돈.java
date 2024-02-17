import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = 1000 - n;
		int[] coins = {500, 100, 50, 10, 5, 1};
		int cnt = 0;
		
		for(int i = 0; i < coins.length && m > 0; i++) {
			int coin = coins[i];
			if(coin > m) {
				continue;
			}
			cnt += m/coin;
			m %= coin;
		}
		
		System.out.println(cnt);
	}

}