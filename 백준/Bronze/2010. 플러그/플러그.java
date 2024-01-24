import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int len = n - 1;
		int m = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < len; i++) {
			m += Integer.parseInt(br.readLine()) - 1;
		}
		
		System.out.println(m);
	}

}