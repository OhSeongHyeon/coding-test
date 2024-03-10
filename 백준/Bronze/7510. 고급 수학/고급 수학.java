import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= t; i++) {
			int[] arr = Arrays.stream(br.readLine().split("\\s"))
				.mapToInt(Integer::parseInt)
				.sorted()
				.toArray();
			boolean isRightTri = arr[0]*arr[0] + arr[1]*arr[1] == arr[2]*arr[2];
			sb.append(String.format("Scenario #%d:\n%s\n\n", i, isRightTri ? "yes" : "no"));
		}
		
		System.out.println(sb);
	}

}