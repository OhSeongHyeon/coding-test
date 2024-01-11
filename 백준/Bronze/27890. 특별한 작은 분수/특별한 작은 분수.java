import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x0 = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		System.out.println(n==0 ? x0 : heightOfWaterColumnOverTime(x0, n));
	}

	private static int heightOfWaterColumnOverTime(int x0, int n) {
		if(n == 0) {
			return x0;
		}
		
		int x = x0;
		
		for (int sec = 1; sec <= n; sec++) {
			x = x%2==0 ? (int) Math.floor(x/2) ^ 6 : 2*x ^ 6;
		}
		
		return x;
	}
}