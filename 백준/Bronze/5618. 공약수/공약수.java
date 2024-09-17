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
		StringBuilder sb = new StringBuilder("1\n");
		
		for (int i = 2; i <= arr[0]; i++) {
			boolean isCorrect = true;
			
			for (int j = 0; j < n; j++) {
				if(arr[j]%i != 0) {
					isCorrect = false;
					break;
				}
			}
			
			if(isCorrect) {
				sb.append(i).append("\n");
			}
		}
		
		System.out.print(sb);
	}
	
}