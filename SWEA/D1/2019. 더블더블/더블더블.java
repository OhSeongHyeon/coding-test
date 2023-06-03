import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		try(
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
			StringTokenizer st = new StringTokenizer(br.readLine());
			StringBuilder sb = new StringBuilder();
			int n = Integer.parseInt(st.nextToken());
			
			for (int i = 0; i <= n; i++) {
				sb.append((int) Math.pow(2, i)).append(" ");
			}
			
			bw.write(sb.toString());
			bw.flush();
		}
	}

}