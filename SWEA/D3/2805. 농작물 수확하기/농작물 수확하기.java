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
			
			for (int i = 1; i <= tc; i++) {
				int n = Integer.parseInt(br.readLine());
				int[][] field = new int[n][n];
				int harvest = 0;
				
				// 밭 만들기
				for (int j = 0; j < n; j++) {
					char[] inp = br.readLine().toCharArray();
					for (int k = 0; k < n; k++) {
						field[j][k] = inp[k] - '0';
					}
				}
				
				int axis = n/2;
				int lr = n/2;
				int rr = n/2;
				
				for (int j = 0; j < n; j++) {
					for (int k = lr; k <= rr; k++) {
						harvest += field[j][k];
					}
					if(j < axis) {
						lr--;
						rr++;
						continue;
					}
					lr++;
					rr--;
				}
				
				sb.append(String.format("#%d %d\n", i, harvest));
			}
			
			bw.write(sb.toString());
            bw.flush();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
	}
	
}