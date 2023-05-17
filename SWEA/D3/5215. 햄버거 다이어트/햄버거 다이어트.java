import java.io.*;
import java.util.*;

public class Solution {
	
	private static int n;
	private static int l;
	private static int m;
	private static int[] s;
	private static int[] c;

	public static void main(String[] args) {
		try(
        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ){
			int tc = Integer.parseInt(br.readLine());
			StringBuilder sb = new StringBuilder();
			
			for (int z = 1; z <= tc; z++) {
				String[] inp = br.readLine().split("\\s");
				n = Integer.parseInt(inp[0]);
				l = Integer.parseInt(inp[1]);
				s = new int[n];
				c = new int[n];
				
				for (int i = 0; i < n; i++) {
					String[] inp2 = br.readLine().split("\\s");
					s[i] = Integer.parseInt(inp2[0]);
					c[i] = Integer.parseInt(inp2[1]);
				}
				
				m = 0;
				
				searchMax(0, 0, 0);
				
				sb.append(String.format("#%d %d\n", z, m));
			}
			
			bw.write(sb.toString());
            bw.flush();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
	}

    public static void searchMax(int idx, int scr, int cal) {
        if (cal > l) return;
        if (cal <= l) m = Math.max(m, scr);
        if (idx == n) return;
        
        searchMax(idx+1, scr + s[idx], cal + c[idx]);
        searchMax(idx+1, scr, cal);
    }
	
}