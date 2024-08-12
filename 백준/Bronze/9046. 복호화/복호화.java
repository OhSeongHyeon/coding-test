import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int[] alpha = new int['z'-'a'+1];
		
		for (int i = 0; i < t; i++) {
			String inp = br.readLine();
			int maxFreq = 0;
			int maxFreqCnt = 0;
			int targetIdx = 0;
			
			for (char c : inp.toCharArray()) {
				if(Character.isLowerCase(c)) {
					alpha[c-'a']++;
				}
			}
			
			for (int j = 0; j < alpha.length; j++) {
				maxFreq = Math.max(maxFreq, alpha[j]);
			}
			
			for (int j = 0; j < alpha.length; j++) {
				if(maxFreq == alpha[j]) {
					maxFreqCnt++;
					targetIdx = j;
				}
			}
			
			sb.append(maxFreqCnt > 1 ? "?" : (char) ('a' + targetIdx))
				.append("\n");
			Arrays.fill(alpha, 0);
		}
		
		System.out.print(sb);
	}

}