import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int len = 5 * n;
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < len; i++) {
			sb.append((i/n + 1)%2 == 0 ? "@".repeat(n) : "@".repeat(len)).append("\n");
		}
		
		System.out.println(sb);
	}

}