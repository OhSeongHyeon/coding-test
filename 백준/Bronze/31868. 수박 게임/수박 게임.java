import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().split("\\s");
		int n = Integer.parseInt(sp[0]);
		int k = Integer.parseInt(sp[1]);
		int loop = n-1;
		int cnt = k;
		
		for (int i = 0; i < loop; i++) {
			cnt /= 2;
		}
		
		System.out.println(cnt);
	}

}