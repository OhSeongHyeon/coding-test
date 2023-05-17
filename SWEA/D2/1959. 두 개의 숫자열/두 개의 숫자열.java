import java.io.*;
import java.util.*;

public class Solution {
	
	public static void main(String[] args) {
		try(
        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ){
			int tc = Integer.parseInt(br.readLine());
			StringBuilder sb = new StringBuilder();
			
			for (int z = 1; z <= tc; z++) {
				String[] split = br.readLine().split("\\s");
				int n = Integer.parseInt(split[0]);
				int[] a = new int[n];
				String[] inp1 = br.readLine().split("\\s");
				for (int i = 0; i < n; i++) {
					a[i] = Integer.parseInt(inp1[i]);
				}
				
				int m = Integer.parseInt(split[1]);
				int[] b = new int[m];
				String[] inp2 = br.readLine().split("\\s");
				for (int i = 0; i < m; i++) {
					b[i] = Integer.parseInt(inp2[i]);
				}
				
				int max = Integer.MIN_VALUE;
				
				if(n<m) {
					for (int i = 0; i <= m-n; i++) {
						int sum = 0;
						for (int j = 0; j < n; j++) {
							sum += a[j] * b[j+i];
						}
						max = Math.max(max, sum);
					}
				}
				else {
					for (int i = 0; i <= n-m; i++) {
						int sum = 0;
						for (int j = 0; j < m; j++) {
							sum += a[j+i] * b[j];
						}
						max = Math.max(max, sum);
					}
				}
				
				sb.append(String.format("#%d %d\n", z, max));
			}
			
			bw.write(sb.toString());
            bw.flush();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
	}
	
}