import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		int[] arr = Arrays.stream(br.readLine().split("\\s"))
			.mapToInt(Integer::parseInt)
			.toArray();
		int push = 0;
		
		for (int i = 0; i < arr.length; i++, push++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j] && i++ >= 0) {
					continue;
				}
				break;
			}
		}
		
		System.out.println(push);
	}

}