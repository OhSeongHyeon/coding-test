import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long sum = 0;
		
		for (int i = 0; i < n; i++) {
			String[] sp = br.readLine().split(" ");
			for (int j = 0; j < n; j++) {
				sum += Long.parseLong(sp[j]);
			}
		}
		
		System.out.println(sum);
	}
	
}