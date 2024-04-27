import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		while(t-- > 0) {
			String[] inpLine1 = br.readLine().split("\\s");
			int n = Integer.parseInt(inpLine1[0]);
			int k = Integer.parseInt(inpLine1[1]);
			String[] inpLIne2 = br.readLine().split("\\s");
			int sum = 0;

			for (int i = 0; i < n; i++) {
				int c = Integer.parseInt(inpLIne2[i]);
				sum += c/k;
			}

			sb.append(sum).append("\n");
		}

		System.out.println(sb);
	}

}