import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] ca = br.readLine().toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < ca.length; i++) {
			sb.append(ca[i]);
			if( (i+1)%10 == 0 ) {
				sb.append("\n");
			}
		}
		
		System.out.println(sb);
	}
	
}