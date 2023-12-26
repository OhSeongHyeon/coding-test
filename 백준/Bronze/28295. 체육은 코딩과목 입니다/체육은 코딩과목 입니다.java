import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int order = 10;
		char[] direction = new char[] {'N', 'E', 'S', 'W'};
		int sum = 0;
		int[] t = new int[] {1, 2, -1};
		
		while(order-- > 0) {
			int n = Integer.parseInt(br.readLine());
			sum += t[n-1];
		}
		
		int idx = sum >= 0 ? sum%4 : (4-sum%4)%4;
		System.out.println(String.valueOf(direction[idx]));
	}

}