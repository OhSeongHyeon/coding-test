import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in;
		StringBuilder sb = new StringBuilder();

		while( !(in = br.readLine()).equals("0 0 0 0") ) {
			String[] sp = in.split(" ");
			int a = Integer.parseInt(sp[0]);
			int b = Integer.parseInt(sp[1]);
			int c = Integer.parseInt(sp[2]);
			int d = Integer.parseInt(sp[3]);
			sb.append(String.format("%d %d\n", c-b, d-a));
		}
		
		System.out.println(sb);
	}

}