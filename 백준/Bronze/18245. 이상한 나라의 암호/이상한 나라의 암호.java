import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in;
		int skip = 0;
		StringBuilder sb = new StringBuilder();
		
		while( !(in = br.readLine()).equals("Was it a cat I saw?") && ++skip > 0 ) {
			char[] ca = in.toCharArray();
			for (int i = 0; i < ca.length; i += 1 + skip) {
				sb.append(ca[i]);
			}
			sb.append("\n");
		}

		System.out.print(sb);
	}

}