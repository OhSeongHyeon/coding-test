import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String in;
		
		while( !(in = br.readLine()).equals("0 0") ) {
			String[] sp = in.split("\\s");
			int a = Integer.parseInt(sp[0]);
			int b = Integer.parseInt(sp[1]);
			sb.append(String.format("%d %d / %d\n", a/b, a%b, b));
		}
		
		System.out.println(sb);
	}

}