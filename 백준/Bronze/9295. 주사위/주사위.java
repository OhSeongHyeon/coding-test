import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i <= t; i++) {
			String[] sp = br.readLine().split("\\s");
			int a = Integer.parseInt(sp[0]);
			int b = Integer.parseInt(sp[1]);
			sb.append(String.format("Case %d: %d\n", i, a+b));
		}
		
		System.out.println(sb);
	}

}