import java.io.*;
import java.math.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while(t-- > 0) {
			br.readLine();
			int n = Integer.parseInt(br.readLine());
			BigDecimal sum = BigDecimal.ZERO;
			
			for (int i = 0; i < n; i++) {
				sum = sum.add(new BigDecimal(br.readLine()));
			}
			
			BigDecimal avg = sum.divide(BigDecimal.valueOf(n), 2, RoundingMode.HALF_UP);
			BigDecimal mod = avg.remainder(BigDecimal.ONE);
			sb.append(mod.compareTo(BigDecimal.ZERO) == 0 ? "YES\n" : "NO\n");
		}
		
		System.out.println(sb);
	}

}