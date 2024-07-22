import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while(t-- > 0) {
			String[] sp = br.readLine().split(" ");
			int len = sp[0].length();
			sb.append("Distances: ");
			
			for (int i = 0; i < len; i++) {
				char c1 = sp[0].charAt(i);
				char c2 = sp[1].charAt(i);
				int d = c2 - c1 >= 0 ? c2 - c1 : 'Z' - 'A' + 1 + c2 - c1;
				sb.append(d).append(" ");
			}
			
			sb.setLength(sb.length() - 1);
			sb.append("\n");
		}
		
		System.out.println(sb);
	}

}
