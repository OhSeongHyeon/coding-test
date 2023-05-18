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
			
			for (int t = 1; t <= tc; t++) {
				String[] inp = br.readLine().split("\\s");
				int n = Integer.parseInt(inp[0]);
				int k = Integer.parseInt(inp[1]);
				int[][] board = new int[n][n];
				int cnt = 0;
				
				for (int i = 0; i < n; i++) {
					String inp2 = br.readLine();
					
					// 입력 받으면서 가로체크
					String[] vCheck = inp2.replaceAll("\\s", "").split("0");
					for (int j = 0; j < vCheck.length; j++) {
						if(vCheck[j].length() == k) {
							cnt++;
						}
					}
					
					String[] inpSplit = inp2.split("\\s");
					for (int j = 0; j < n; j++) {
						board[i][j] = Integer.parseInt(inpSplit[j]);
					}
				}
				
				// 세로체크
				for (int i = 0; i < n; i++) {
					StringBuilder hsb = new StringBuilder();
					for (int j = 0; j < n; j++) {
						hsb.append(board[j][i]);
					}
					String[] hCheck = hsb.toString().split("0");
					for (int j = 0; j < hCheck.length; j++) {
						if(hCheck[j].length() == k) {
							cnt++;
						}
					}
				}

				sb.append(String.format("#%d %d\n", t, cnt));
			}
			
			bw.write(sb.toString());
            bw.flush();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
	}
	
}