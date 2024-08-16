import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = br.lines()
			.limit(9)
			.mapToInt(Integer::parseInt)
			.toArray();
		int total = Arrays.stream(arr)
			.sum();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(total - arr[i] - arr[j] != 100) {
					continue;
				}
				findRealDwarves(arr, sb, i, j);
				break;
			}
		}
		
		System.out.println(sb);
	}

	private static void findRealDwarves(int[] arr, StringBuilder sb, int i, int j) {
		for (int k = 0; k < arr.length; k++) {
			if(i == k || j == k) {
				continue;
			}
			sb.append(arr[k]).append("\n");
		}
	}

}