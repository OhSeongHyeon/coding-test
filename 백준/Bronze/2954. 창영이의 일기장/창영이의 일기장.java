import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String rl = br.readLine();
		int len = rl.length();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < len; i++) {
			char c = rl.charAt(i);
			sb.append(c);
			switch (c) {
			case 'a': case 'e': case 'i': case 'o': case 'u': 
				i += 2;
				break;
			}
		}
		
		System.out.println(sb);
	}
	
}