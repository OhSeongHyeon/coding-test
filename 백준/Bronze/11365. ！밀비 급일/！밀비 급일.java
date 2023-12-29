import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input;
		
		while( !(input = br.readLine()).equals("END") ) {
			//sb.append(new StringBuilder(input).reverse()).append("\n");
			char[] ca = input.toCharArray();
			for (int i = ca.length-1; i >= 0; i--) {
				sb.append(ca[i]);
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}

}