import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
			int tc = Integer.parseInt(br.readLine());
			StringBuilder sb = new StringBuilder();
			
			for (int z = 1; z <= tc; z++) {
				int n = Integer.parseInt(br.readLine());
				int sum = 0;
				
				for (int i = 1; i <= n; i++) {
					if(i%2 == 0) {
						sum -= i;
						continue;
					}
					sum += i;
				}
				
				sb.append(String.format("#%d %d\n", z, sum));
			}
			
			bw.write(sb.toString());
			bw.flush();
		}
	}
	
}