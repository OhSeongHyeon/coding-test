import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = Arrays.stream(br.readLine().split("\\s"))
			.mapToInt(Integer::parseInt)
			.toArray();
		int area = (arr[1]/arr[3]) * (arr[2]/arr[3]);
		System.out.println(arr[0] > area ? area : arr[0]);
	}

}