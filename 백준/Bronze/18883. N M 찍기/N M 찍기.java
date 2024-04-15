import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = Arrays.stream(br.readLine().split("\\s"))
			.mapToInt(Integer::parseInt)
			.toArray();
		StringBuilder sb = new StringBuilder();
		int n = arr[0];
		int m = arr[1];
		int len = n * m;
		
		for (int i = 1; i <= len; i++) {
			sb.append(i).append(i%m == 0 ? "\n" : " ");
		}
		
		System.out.println(sb);
	}

}