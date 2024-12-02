import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] menu = new int[n];
		
		for (int i = 0; i < n; i++) {
			menu[i] = Integer.parseInt(br.readLine());
		}
		
		int m = Integer.parseInt(br.readLine());
		int sum = 0;
		
		for (int i = 0; i < m; i++) {
			sum += menu[Integer.parseInt(br.readLine()) - 1];
		}
		
		System.out.println(sum);
	}

}