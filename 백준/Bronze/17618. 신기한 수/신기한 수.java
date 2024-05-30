import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for (int i = 1; i <= n; i++) {
			int d = 0;
			int t = i;
			while(t != 0) {
				d += t%10;
				t /= 10;
			}
			cnt += i%d == 0 ? 1 : 0;
		}
		
		System.out.println(cnt);
	}

}