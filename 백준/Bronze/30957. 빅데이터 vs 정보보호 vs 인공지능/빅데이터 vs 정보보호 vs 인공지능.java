import java.util.*;
import java.io.*;

public class Main {
	
	private static final Map<Character, Integer> m = new LinkedHashMap<>();
	
	static {
		m.put('B', 0);
		m.put('S', 0);
		m.put('A', 0);
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		int tri = n%3 == 0 ? n/3 : n/3 + 1;
		String output = "";
		
		for (char c : s.toCharArray()) {
			m.put(c, m.get(c) + 1);
		}
		
		int a = m.get('B');
		
		for (Map.Entry<Character, Integer> e : m.entrySet()) {
			char k = e.getKey();
			int v = e.getValue();
			
			if(v >= tri && v >= a) {
				output += String.valueOf(k);
			}
		}
		
		System.out.println(output.length() == 3 ? "SCU" : output);
	}

}