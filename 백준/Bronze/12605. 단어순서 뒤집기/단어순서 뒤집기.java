import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= n; i++) {
			String inp = br.readLine();
			String[] sp = inp.split(" ");
			sb.append(String.format("Case #%d: ", i));
			
			for (int j = sp.length - 1; j >= 0; j--) {
				sb.append(sp[j]).append(" ");
			}
			
			sb.setLength(sb.length() - 1);
			sb.append("\n");
		}
		
		System.out.println(sb);
	}

}