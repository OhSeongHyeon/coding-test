import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int[] arr = Arrays.stream(input.split("\\s"))
			.mapToInt(Integer::parseInt)
			.toArray();
		System.out.println(arr[0]+arr[1]+arr[2] >= 100 ? "OK" : findMinCollege(arr, Math.min(Math.min(arr[0], arr[1]), arr[2])));
	}
	
	private static String findMinCollege(int[] arr, int min) {
		int idx = -1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == min) idx = i;
		}
		switch (idx) {
			case 0: return "Soongsil";
			case 1: return "Korea";
			case 2: return "Hanyang";
		}
		return "NotFound";
	}

}