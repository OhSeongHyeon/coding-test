import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = Arrays.stream(br.readLine().split("\\s"))
			.mapToInt(Integer::parseInt)
			.sorted()
			.toArray();
		int o = Integer.MAX_VALUE;
		
		for (int i = 1; i < arr.length; i++) {
			o = Math.min(o, arr[i] - arr[i-1]);
		}
		
		for (int i = 1; i < arr.length; i++) {
			int pre = arr[i-1] + o;
			if(arr[i] != pre) {
				System.out.println(pre);
				return;
			}
		}
		
		System.out.println(arr[arr.length-1] + o);
	}

}