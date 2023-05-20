import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		try(
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
			int tc = Integer.parseInt(br.readLine());
			StringBuilder sb = new StringBuilder();
			
			for (int z = 1; z <= tc; z++) {
				int iter = Integer.parseInt(br.readLine());
				StringBuilder print = new StringBuilder();
				sb.append("#"+z+" \n");
				
				for (int i = 0; i < iter; i++) {
					String[] inp = br.readLine().split("\\s");
					String w = inp[0];
					int repeat = Integer.parseInt(inp[1]);
					for (int j = 0; j < repeat; j++) {
						print.append(w);
					}
				}
				
				String s = print.toString();
				int len = s.length();
				for (int i = 0; i < len; i++) {
					char c = s.charAt(i);
					sb.append(c);
					if( (i+1)%10 == 0 ) {
						sb.append("\n");
					}
				}
				
				sb.append("\n");
			}
			
			bw.write(sb.toString());
			bw.flush();
		}
	}

}