import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		try(
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
			int n = Integer.parseInt(br.readLine());
			StringBuilder sb = new StringBuilder();
			
			for (int i = 1; i <= n; i++) {
				if(n%i==0) sb.append(i).append(" ");
			}
			
			bw.write(sb.toString());
			bw.flush();
		}
	}

}