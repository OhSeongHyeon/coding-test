import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n = 'Z' - 'A' + 1;
		int upperAlphaSum = n*(n+1)/2 + ('A'-1)*n;
		
		for (int i = 0; i < t; i++) {
			Set<Character> set = new HashSet<>();
			int sum = upperAlphaSum;
			
			for (char c : br.readLine().toCharArray()) {
				if(set.add(c)) sum -= c;
			}
			
			sb.append(sum).append("\n");
		}
		
		System.out.println(sb);
	}

}