import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = Arrays.stream(br.readLine().split("\\s"))
			.mapToInt(Integer::parseInt)
			.sorted()
			.toArray();
		String alpha = br.readLine();
		int len = alpha.length();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < len; i++) {
			int idx = alpha.charAt(i) - 'A';
			sb.append(arr[idx]).append(" ");
		}
		
		System.out.println(sb.toString().trim());
	}

}