import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		if(n < 10) {
			System.out.println(1);
			return;
		}
		int res = 0;
		
		outer:
		for (int i = 2; i <= 9; i++) {
			inner:
			for (int j = 1; j <= 9; j++) {
				int googoo = i*j;
				if(googoo > n) {
					break inner;
				}
				if(googoo == n) {
					res++;
					break outer;
				}
			}
		}
		
		System.out.println(res);
	}

}