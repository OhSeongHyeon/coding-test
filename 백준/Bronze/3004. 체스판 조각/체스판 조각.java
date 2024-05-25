import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int inc = 1;
		int res = 1;
		
		for (int i = 1; i <= n; i++) {
			inc += i%2==0 ? 1 : 0;
			res += inc;
		}
		
		System.out.println(res);
	}

}
