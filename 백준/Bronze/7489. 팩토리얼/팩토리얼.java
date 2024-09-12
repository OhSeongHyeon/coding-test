import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int mod = 100_000; //오버플로우 방지
		
		while(t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int res = 1;
			
			for (int i = 2; i <= n; i++) {
				res *= i;
				while (res % 10 == 0) {
                    res /= 10;
                }
				res %= mod;
			}
			
			sb.append(res%10).append("\n");
		}
		
		System.out.print(sb);
	}
	
}