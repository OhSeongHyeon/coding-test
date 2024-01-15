import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < n; i++) {
			String input = br.readLine();
			int[] arr = Arrays.stream(input.split("\\s"))
				.mapToInt(Integer::parseInt)
				.sorted()
				.toArray();
			Set<Integer> set = new HashSet<>();
			int dup = arr[arr.length-1]; // 최댓값
			
			for (int j = 0; j < arr.length; j++) {
				if( !set.add(arr[j]) ) dup = arr[j];
			}
			
			switch (set.size()) {
				case 1: max = Math.max(max, 10_000 + dup * 1_000);
					break;
				case 2: max = Math.max(max, 1_000 + dup * 100);
					break;
				case 3: max = Math.max(max, arr[arr.length-1] * 100);
					break;
			}
		}
		
		System.out.println(max);
	}
	
}