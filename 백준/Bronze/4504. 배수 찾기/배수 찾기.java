import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		String in;
		
		while( !(in = br.readLine()).equals("0") ) {
			int a = Integer.parseInt(in);
			String s = a%n == 0 ? "" : "NOT ";
			sb.append(String.format("%d is %sa multiple of %d.\n", a, s, n));
		}
		
		System.out.println(sb);
	}

}