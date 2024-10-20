import java.util.*;
import java.util.stream.IntStream;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp1 = br.readLine().split(" ");
		int n = Integer.parseInt(sp1[0]);
		int[] arr = Arrays.stream(br.readLine().split(" "))
			.mapToInt(Integer::parseInt)
			.toArray();
		int sum = IntStream.rangeClosed(1, n)
			.filter(i -> {
				for(int num : arr) {
					if(i%num == 0) return true;
				}
				return false;
			})
			.sum();
		
		System.out.println(sum);
	}
	
}