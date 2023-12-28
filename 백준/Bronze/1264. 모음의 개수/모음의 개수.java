import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input;
		
		while( !(input = br.readLine()).equals("#") ) {
			int cnt = input.toLowerCase()
				.replaceAll("[^aeiou]", "")
				.length();
			sb.append(cnt).append("\n");
		}
		
		System.out.println(sb);
	}

}
