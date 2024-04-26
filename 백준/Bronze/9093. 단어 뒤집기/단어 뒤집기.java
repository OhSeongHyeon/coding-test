import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringBuilder rv = new StringBuilder();
		
		while(n-- > 0) {
			String[] sp = br.readLine().split("\\s");
			
			for (int i = 0; i < sp.length; i++) {
				sb.append(rv.append(sp[i]).reverse())
					.append(i < sp.length - 1 ? " " : "");
				rv.setLength(0);
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}

}