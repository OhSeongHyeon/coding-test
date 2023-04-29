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
			
			for (int c = 1; c <= tc; c++) {
				String[] inp1 = br.readLine().split(" ");
				int n = Integer.parseInt(inp1[0]);
				int m = Integer.parseInt(inp1[1]);
				int kill = 0;
				int[][] area = new int[n][n];
				
				for (int i = 0; i < n; i++) {
					String[] inp2 = br.readLine().split(" ");
					for (int j = 0; j < n; j++) {
						area[i][j] = Integer.parseInt(inp2[j]);
					}
				}
				
				for (int i = 0; i <= n-m; i++) {
					for (int j = 0; j <= n-m; j++) {
						int cnt = 0;
						for (int k = i; k < i+m; k++) {
							for (int l = j; l < j+m; l++) {
								cnt += area[k][l];
							}
						}
						kill = Math.max(kill, cnt);
					}
				}
				
				sb.append(String.format("#%d %d\n", c, kill));
			}
			
			bw.write(sb.toString());
            bw.flush();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
	}

}