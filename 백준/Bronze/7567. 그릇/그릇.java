import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String rl = br.readLine();
		int len = rl.length();
		char p = rl.charAt(0);
		int sum = 10;
		
		for (int i = 1; i < len; i++) {
			char c = rl.charAt(i);
			sum += p == c ? 5 : 10;
			p = c;
		}
		
		System.out.println(sum);
	}
	
}