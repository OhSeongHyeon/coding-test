import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long[] arr = Arrays.stream(br.readLine().split(" "))
			.mapToLong(Long::parseLong)
			.sorted()
			.toArray();
		if(arr[0] == arr[1]) {
			System.out.println(0);
			return;
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(arr[1] - arr[0] - 1).append("\n");
		
		for (long i = arr[0] + 1; i < arr[1]; i++) {
			sb.append(i).append(" ");
		}
		
		sb.setLength(sb.length() - 1);
		System.out.println(sb);
	}
	
}