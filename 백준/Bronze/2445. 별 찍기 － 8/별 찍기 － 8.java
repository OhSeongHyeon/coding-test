import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 1; i < n; i++) {
			writingStar(sb, n, i);
		}
		
		sb.append("*".repeat(n*2)).append("\n");
		
		for (int i = n-1; i >= 1; i--) {
			writingStar(sb, n, i);
		}
		
		System.out.println(sb);
	}

	private static void writingStar(StringBuilder sb, int n, int i) {
		String star = "*".repeat(i);
		String space = " ".repeat((n-i)*2);
		sb.append(star)
			.append(space)
			.append(star)
			.append("\n");
	}
	
}