import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		String[] fileNames = new String[n];
		Set<Character> set = new HashSet<>();
		
		for (int i = 0; i < n; i++) {
			fileNames[i] = br.readLine();
		}
		
		int nameLen = fileNames[0].length();
		
		for (int i = 0; i < nameLen; i++) {
			char c = 0;
			for (int j = 0; j < n; j++) {
				c = fileNames[j].charAt(i);
				set.add(c);
			}
			sb.append(set.size() == 1 ? String.valueOf(c) : "?");
			set.clear();
		}
		
		System.out.println(sb);
	}
	
}