import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while (t-- > 0) {
			String rl = br.readLine();
			int mid = rl.length()/2;
			sb.append(rl.charAt(mid-1) == rl.charAt(mid) ? "Do-it\n" : "Do-it-Not\n");
		}
		
		System.out.println(sb);
	}

}