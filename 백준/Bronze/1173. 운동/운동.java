import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().split(" ");
		int n = Integer.parseInt(sp[0]);
		int min_m = Integer.parseInt(sp[1]);
		int max_m = Integer.parseInt(sp[2]);
		int t = Integer.parseInt(sp[3]);
		int r = Integer.parseInt(sp[4]);
		
		if(max_m - min_m < t) {
			System.out.println(-1);
			return;
		}
		
		int cur_m = min_m;
		int minTime = 0;
		int exercise = 0;
		
		while (exercise < n) {
			minTime++;
			int m = cur_m + t;
			cur_m = m <= max_m && (exercise += 1) > 0 ? m : Math.max(cur_m - r, min_m);
		}
		
		System.out.println(minTime);
	}
	
}