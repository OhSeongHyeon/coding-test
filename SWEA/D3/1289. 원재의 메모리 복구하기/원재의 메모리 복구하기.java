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
				char[] inp = br.readLine().toCharArray();
				int len = inp.length;
				char[] fix = new char[inp.length];
				Arrays.fill(fix, '0');
				int cnt = 0;
				
				for (int j = 0; j < len; j++) {
					if(inp[j] != fix[j]) {
						cnt++;
						if(inp[j] == '1') {
							for (int k = j; k < len; k++) {
								fix[k] = '1';
							}
						}else {
							for (int k = j; k < len; k++) {
								fix[k] = '0';
							}
						}
					}
				}
				
				sb.append(String.format("#%d %d\n", i, cnt));
			}
			
			bw.write(sb.toString());
            bw.flush();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
	}
	
}