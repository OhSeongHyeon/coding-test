import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in;
		StringBuilder sb = new StringBuilder();
		boolean[] isExist = new boolean['z'-'a'+1];
		
		while( !(in = br.readLine()).equals("#") ) {
			int cnt = 0;
			for (char c : in.toLowerCase().toCharArray()) {
				if(Character.isLowerCase(c) && !isExist[c-'a']) {
					isExist[c-'a'] = true;
				}
			}
			for (boolean b : isExist) {
				if(b) {
					cnt++;
				}
			}
			sb.append(cnt).append("\n");
			Arrays.fill(isExist, false);
		}
		
		System.out.println(sb);
	}
	
}