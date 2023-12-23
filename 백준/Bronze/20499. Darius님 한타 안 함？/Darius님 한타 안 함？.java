import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = Arrays.stream(br.readLine().split("/"))
			.mapToInt(Integer::parseInt)
			.toArray();
		System.out.println(arr[1]==0 || arr[0]+arr[2] < arr[1] ? "hasu" : "gosu");
	}
}