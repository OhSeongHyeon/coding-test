import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] alphaCnt = new int['z' - 'a' + 1];
		br.lines()
			.forEach(s -> {
				for (char c : s.toCharArray()) {
					if(Character.isLowerCase(c)) {
						alphaCnt[c - 'a']++;
					}
				}
			});
		
		int max = Arrays.stream(alphaCnt)
			.max()
			.orElse(0);
		
		for (int i = 0; i < alphaCnt.length; i++) {
			if(max == alphaCnt[i]) {
				sb.append((char) ('a' + i));
			}
		}
		
		System.out.println(sb);
	}

}