import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input;
		
		while( !(input = br.readLine()).equals("0 0 0") ) {
			StringTokenizer st = new StringTokenizer(input);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if(b-a == c-b) {
				sb.append("AP ").append(c+c-b);
			}else {
				sb.append("GP ").append(c*c/b);
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}

}