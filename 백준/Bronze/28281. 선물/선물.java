import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		int[] arr = Arrays.stream(br.readLine().split("\\s"))
			.mapToInt(Integer::parseInt)
			.toArray();
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < n-1; i++) {
			min = Math.min(min, arr[i]*x + arr[i+1]*x);
		}
		
		System.out.println(min);
	}
	
}