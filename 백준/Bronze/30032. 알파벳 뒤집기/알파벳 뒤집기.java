import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().split("\\s");
		int n = Integer.parseInt(sp[0]);
		int d = Integer.parseInt(sp[1]);
		StringBuilder sb = new StringBuilder();
		
		while(n-- > 0) {
			String in = br.readLine();
			for (char c : in.toCharArray()) {
				switch(c) {
					case 'b': sb.append(d==1 ? 'p' : 'd');
						break;
					case 'd': sb.append(d==1 ? 'q' : 'b');
						break;
					case 'q': sb.append(d==1 ? 'd' : 'p');
						break;
					case 'p': sb.append(d==1 ? 'b' : 'q');
						break;
				}
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}

}