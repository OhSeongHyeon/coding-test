import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		StringBuilder sb = new StringBuilder();
		
		while( !(s = br.readLine()).equals("0 0") ) {
			String[] sp = s.split("\\s");
			int x = Integer.parseInt(sp[0]);
			int y = Integer.parseInt(sp[1]);
			int res = x + (x - y);
			sb.append(res).append("\n");
		}
		
		System.out.println(sb);
	}

}