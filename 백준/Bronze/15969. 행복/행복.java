import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = Arrays.stream(br.readLine().split(" "))
			.mapToInt(Integer::parseInt)
			.sorted()
			.toArray();
		System.out.println(arr[n-1] - arr[0]);
	}
	
}