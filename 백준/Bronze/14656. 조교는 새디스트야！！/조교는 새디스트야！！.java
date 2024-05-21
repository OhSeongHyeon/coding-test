import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sp = br.readLine().split("\\s");
		int cnt = 0;
		
		for (int i = 1; i <= n; i++) {
			cnt += Integer.parseInt(sp[i-1]) != i ? 1 : 0;
		}
		
		System.out.println(cnt);
	}

}