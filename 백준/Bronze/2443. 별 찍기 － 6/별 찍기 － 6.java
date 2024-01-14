import java.io.*;

public class Main {
	
	private static final String STAR = "*";
	private static final String SPACE = " ";
	private static final String NEW_LINE = "\n";
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		/*
		for (int i = 1; i <= n; i++) {
			String star = STAR.repeat((n-i)*2+1);
			String space = SPACE.repeat(i-1);
			sb.append(space)
				.append(star)
				.append(NEW_LINE);
		}
		*/
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				sb.append(SPACE);
			}
			for (int j = 0; j < n*2-1-i*2; j++) {
				sb.append(STAR);
			}
			sb.append(NEW_LINE);
		}
		
		System.out.println(sb);
	}
	
}