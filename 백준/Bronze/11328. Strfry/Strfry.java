import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int[] alpha = new int['z' - 'a' + 1]; // type 2
		
		for (int i = 0; i < n; i++) {
			String[] sp = br.readLine().split("\\s+");
			boolean isPos = isPos(sp); // type 1
			//boolean isPos = isPos(alpha, sp); // type 2
			sb.append(isPos ? "Possible\n" : "Impossible\n");
		}
		
		System.out.print(sb);
	}
	
	// type 1 start
	private static String sortedString(String s) {
		char[] ca = s.toCharArray();
		Arrays.sort(ca);
		return String.valueOf(ca);
	}
	
	private static boolean isPos(String[] sp) {
		String s1 = sortedString(sp[0]);
		String s2 = sortedString(sp[1]);
		return s1.equals(s2);
	}
	// type 1 end
	
	// type 2 start
	private static void alphaCounter(int[] alpha, String s, int add) {
		for(char c : s.toCharArray()) {
			alpha[c - 'a'] += add;
		}
	}
	
	private static boolean isPos(int[] alpha, String[] sp) {
		alphaCounter(alpha, sp[0], 1);
		alphaCounter(alpha, sp[1], -1);
		boolean isPos = true;
		for(int j : alpha) {
			if(j != 0) {
				isPos = false;
				break;
			}
		}
		Arrays.fill(alpha, 0);
		return isPos;
	}
	// type 2 end
	
}