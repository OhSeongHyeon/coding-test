import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().split("\\s");
		int k = Integer.parseInt(sp[0]);
		int n = Integer.parseInt(sp[1]);
		if(n==1) {
			System.out.println(-1);
			return;
		}
		
		long res = 1l * k * n / (n-1);
		System.out.println(1l * k * n % (n-1) == 0 ? res : res+1);
	}

}