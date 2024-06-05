import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr1 = createArray(br.readLine());
		int[] arr2 = createArray(br.readLine());
		double a2 = Math.pow(arr1[0] > arr2[0] ? arr1[0] - arr2[0] : arr2[0] - arr1[0], 2);
		double b2 = Math.pow(arr1[1] > arr2[1] ? arr1[1] - arr2[1] : arr2[1] - arr1[1], 2);
		double r2 = Math.pow(arr1[2] + arr2[2], 2);
		System.out.println(a2 + b2 < r2 ? "YES" : "NO");
	}

	private static int[] createArray(String s) throws IOException {
		return Arrays.stream(s.split("\\s"))
			.mapToInt(Integer::parseInt)
			.toArray();
	}

}
