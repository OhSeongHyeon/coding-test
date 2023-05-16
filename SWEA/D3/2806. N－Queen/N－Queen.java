import java.io.*;
import java.util.*;

public class Solution {
	
	public static int board[];
	public static int cnt;

	public static void main(String[] args) {
		try(
        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ){
			int tc = Integer.parseInt(br.readLine());
			StringBuilder sb = new StringBuilder();
			
			for (int i = 1; i <= tc; i++) {
				int n = Integer.parseInt(br.readLine());
				if(n<=3) {
					sb.append(String.format("#%d %d\n", i, n-1 == 0 ? 1 : 0));
					continue;
				}
				
				board = new int[n];
				cnt = 0;
				nq(n, 0);
				
				sb.append(String.format("#%d %d\n", i, cnt));
			}
			
			bw.write(sb.toString());
            bw.flush();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
	}
	
	public static void nq(int n, int d) {
		boolean isPossible; 
		if (d == n) { 
			cnt++;
			return;
		}
		
		for (int i = 0; i < n; i++) { 
			isPossible = true;
			
			for (int j = 0; j < d; j++) {
				if (board[j] == i || board[j] + (d-j) == i || board[j] - (d-j) == i) { 
					isPossible = false;
					break;
				}
			}
			
			if (isPossible) {
				board[d] = i;
				nq(n, d+1);
			}
		}
	}
	
}