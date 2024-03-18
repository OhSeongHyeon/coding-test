import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = Arrays.stream(br.readLine().split("\\s"))
			.mapToInt(Integer::parseInt)
			.toArray();
		int cnt = 0;
		int max = 0;
		
		for (int i = 0; i < n; i++) {
			boolean isZero = arr[i] == 0;
			cnt += isZero ? 0 : 1;
			if(isZero || i == n-1) {
				max = Math.max(max, cnt);
				cnt = 0;
			}
		}
		
		System.out.println(max);
	}

}