import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inp = br.readLine();
		int inpLen = inp.length();
		int[] alpha = new int['z'-'a' + 1];
		Arrays.fill(alpha, -1);
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < inpLen; i++) {
			int alphaIdx = inp.charAt(i) - 'a';
			if(alpha[alphaIdx] == -1) {
				alpha[alphaIdx] = i;
			}
		}
		
		for (int i = 0; i < alpha.length; i++) {
			sb.append(alpha[i])
				.append(" ");
		}
		
		sb.setLength(sb.length() - 1);
		System.out.println(sb);
	}
	
}