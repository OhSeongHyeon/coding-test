import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] w = createArray(br);
		int[] k = createArray(br);
		System.out.printf("%d %d", top3Accumulate(w), top3Accumulate(k));
	}
	
	private static int[] createArray(BufferedReader br) throws IOException {
		int len = 10;
		int[] arr = new int[len];
		
		for (int i = 0; i < len; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		return arr;
	}
	
	private static int top3Accumulate(int[] arr) {
		return Arrays.stream(arr)
			.sorted()
			.skip(7)
			.sum();
	}

}