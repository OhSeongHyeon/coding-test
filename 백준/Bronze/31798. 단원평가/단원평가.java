import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = Arrays.stream(br.readLine().split("\\s"))
			.mapToInt(Integer::parseInt)
			.toArray();
		System.out.println(arr[2] == 0 ? (int) Math.sqrt(arr[0] + arr[1]) : arr[2] * arr[2] - arr[0] - arr[1]);
	}

}