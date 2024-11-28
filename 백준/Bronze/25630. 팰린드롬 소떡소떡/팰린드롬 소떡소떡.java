import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String rl = br.readLine();
		int cnt = 0;
		
		for (int i = 0; i < n / 2; i++) {
			cnt += rl.charAt(i) != rl.charAt(n - 1 - i) ? 1 : 0;
		}
		
		System.out.println(cnt);
	}

}