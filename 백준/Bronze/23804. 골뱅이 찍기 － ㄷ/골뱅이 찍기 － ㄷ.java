import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 5; i++) {
			sb.append(("@".repeat(i > 0 && i < 4 ? n : 5*n) + "\n").repeat(n));
		}
		
		System.out.println(sb);
	}

}