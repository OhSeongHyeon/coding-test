import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < 7; i++) {
			int n = Integer.parseInt(br.readLine());
			if(n%2 != 0) {
				sum += n;
				min = Math.min(min, n);
			}
		}
		
		System.out.println(sum==0 && min==Integer.MAX_VALUE ? -1 : String.format("%d\n%d", sum, min));
	}
	
}