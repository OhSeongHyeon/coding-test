import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		int[] arr = Arrays.stream(br.readLine().split("\\s"))
			.mapToInt(Integer::parseInt)
			.sorted()
			.toArray();
		System.out.println(arr[1]);
		*/
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int min = Math.min(a, Math.min(b, c));
		int max = Math.max(a, Math.max(b, c));
		System.out.println(a + b + c - min - max);
	}
	
}