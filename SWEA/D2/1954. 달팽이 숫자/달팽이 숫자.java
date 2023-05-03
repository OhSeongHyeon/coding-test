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
			int[] dm = {0, 1, 0, -1};
			int[] dn = {1, 0, -1, 0};
			
			for (int c = 1; c <= tc; c++) {
				int inp = Integer.parseInt(br.readLine());
				int[][] arr = new int[inp][inp];
				int dr = 0;
				int m = 0;
				int n = 0;
				
				for (int i = 1; i <= inp*inp; i++) {
					arr[m][n] = i;
					
					int nm = m + dm[dr];
					int nn = n + dn[dr];
					
					if( 0>nm || nm>=inp || 0>nn || nn>=inp || arr[nm][nn] != 0 ) {
						dr = (dr+1) % 4;
					}
					
					m += dm[dr];
					n += dn[dr];
				}
				
				outPrint(sb, arr, c, inp);
			}
			
			bw.write(sb.toString());
            bw.flush();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
	}
	
	private static void outPrint(StringBuilder sb, int[][] arr, int c, int in) {
		sb.append(String.format("#%d\n", c));
		for (int i = 0; i < in; i++) {
			for (int j = 0; j < in; j++) {
				sb.append(arr[i][j]);
				if(j+1 < in) {
					sb.append(" ");
				}
			}
			sb.append("\n");
		}
	}
}