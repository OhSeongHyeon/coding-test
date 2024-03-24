import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		int[] alpha = new int['z'-'a'+1];
		int max = 0;

		for (int i = 0; i < n; i++) {
			char c = s.charAt(i);
			if('a' <= c && c <= 'z') {
				alpha[c - 'a']++;
			}
		}
		
		for(int i : alpha) {
			max = Math.max(max, i);
		}
		
		System.out.println(max);
	}

}