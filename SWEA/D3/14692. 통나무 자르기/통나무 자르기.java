import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= tc; i++) {
			int n = Integer.parseInt(br.readLine());
			sb.append(String.format("#%d ", i));
			if(n%2==0) {
				sb.append("Alice");
			}else {
				sb.append("Bob");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}

}