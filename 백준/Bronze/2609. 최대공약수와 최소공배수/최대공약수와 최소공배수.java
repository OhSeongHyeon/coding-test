import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = Arrays.stream(br.readLine().split("\\s"))
			.mapToInt(Integer::parseInt)
			.toArray();
		System.out.println(gcd(arr[0], arr[1]));
		System.out.println(lcm(arr[0], arr[1]));
	}

	private static int gcd(int a, int b) {
		if (b == 0) return a;
		return gcd(b, a % b);
	}

	private static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}

}