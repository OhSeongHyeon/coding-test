import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
			int z = Integer.parseInt(br.readLine());
			StringBuilder sb = new StringBuilder();
			
			for (int tc = 1; tc <= z; tc++) {
				String[] inp = br.readLine().split("\\s");
				int a = Integer.parseInt(inp[0]);
				int b = Integer.parseInt(inp[1]);
				int cnt = 0;
				
				for (int i = a; i <= b; i++) {
					String s = String.valueOf(i);
					StringBuilder jud1 = new StringBuilder(s);
					double sqrt = Math.sqrt(i);
					char[] ca = String.valueOf(sqrt).toCharArray();
					int target = 0;
					for (int j = 0; j < ca.length; j++) {
						if(ca[j] == '.') {
							target = j;
						}
					}
					
					boolean is = false;
					for (int j = target+1; j < ca.length; j++) {
						if(ca[j] != '0') {
							is = true;
						}
					}
					
					if(is) {
						continue;
					}
					
					String str_sqrt = String.valueOf((int) sqrt);
					StringBuilder jud2 = new StringBuilder(str_sqrt);
					
					if(s.equals(jud1.reverse().toString()) && str_sqrt.equals(jud2.reverse().toString())) {
						cnt++;
					}
				}
				
				sb.append(String.format("#%d %d\n", tc, cnt));
			}
			
			bw.write(sb.toString());
			bw.flush();
		}
	}
	
}