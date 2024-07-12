import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while(t-- > 0) {
			String[] sp = br.readLine().split(" ");
			int[] arr = Arrays.stream(sp)
				.mapToInt(Integer::parseInt)
				.sorted()
				.skip(1)
				.limit(sp.length - 2)
				.toArray();
			sb.append(arr[2] - arr[0] >= 4 ? "KIN" : arr[0] + arr[1] + arr[2])
				.append("\n");
		}
		
		System.out.println(sb);
	}

}