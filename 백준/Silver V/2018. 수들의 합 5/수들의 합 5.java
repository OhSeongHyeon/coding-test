import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 1;
		
		for (int i = 2; i < n; i++) {
			double axis = (double) n/i;
			double rangeMin = Math.ceil(axis - i/2);
			double rangeMax = Math.floor(axis + i/2);
			if(rangeMin < 1) {
				continue;
			}
			int sum = 0;
			
			for (int j = (int) rangeMin; j <= rangeMax; j++) {
				sum += j;
			}
			
			if(sum == n) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}

}