import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String inp;
		
		while( !(inp = br.readLine()).equals("#") ) {
			int cnt = 0;
			char target = inp.charAt(0);
			int len = inp.length();
			
			for (int i = 2; i < len; i++) {
				if(Character.toLowerCase(inp.charAt(i)) == target) {
					cnt++;
				}
			}
			
			sb.append(String.format("%s %d\n", target, cnt));
		}
		
		System.out.println(sb);
	}
	
}