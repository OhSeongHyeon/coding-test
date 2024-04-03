import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while(t-- > 0) {
			String[] insp = br.readLine().split("\\s");
			int v = Integer.parseInt(insp[0]);
			int e = Integer.parseInt(insp[1]);
			int f = 2 - v + e;
			sb.append(f).append("\n");
		}
		
		System.out.println(sb);
	}
	
}