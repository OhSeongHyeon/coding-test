import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while(t-- > 0) {
			String[] insp = br.readLine().split("\\s");
			int c = Integer.parseInt(insp[0]);
			int v = Integer.parseInt(insp[1]);
			sb.append(String.format("You get %d piece(s) and your dad gets %d piece(s).\n", c/v, c%v));
		}
		
		System.out.println(sb);
	}

}