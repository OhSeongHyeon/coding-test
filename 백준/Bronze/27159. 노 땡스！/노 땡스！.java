import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = Arrays.stream(br.readLine().split("\\s"))
			.mapToInt(Integer::parseInt)
			.toArray();
		int sum = arr[0];
		
		for (int i = 1; i < n; i++) {
			if(arr[i-1] != arr[i]-1) {
				sum += arr[i];
			}
		}
		
		System.out.println(sum);
	}
	
}