import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while(t-- > 0) {
			String[] sp = br.readLine().split("\\s");
			int a = Integer.parseInt(sp[0]);
			int b = Integer.parseInt(sp[1]);
			sb.append(a == b ? 1 : (a/b)*(a/b)).append("\n");
		}
		
		System.out.println(sb);
	}

}