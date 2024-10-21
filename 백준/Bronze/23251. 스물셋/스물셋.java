import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		while(t-- > 0) {
			int k = Integer.parseInt(br.readLine());
			sb.append(k * 23).append("\n");
		}

		System.out.print(sb);
	}

}