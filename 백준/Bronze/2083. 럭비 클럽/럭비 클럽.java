import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input;
		
		while( !(input = br.readLine()).equals("# 0 0") ) {
			StringTokenizer st = new StringTokenizer(input);
			String name = st.nextToken();
			int age = Integer.parseInt(st.nextToken());
			int weight = Integer.parseInt(st.nextToken());
			sb.append(name).append(age > 17 || weight >= 80 ? " Senior\n" : " Junior\n");
		}
		
		System.out.println(sb);
	}

}