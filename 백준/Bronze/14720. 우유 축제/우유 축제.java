import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = Arrays.stream(br.readLine().split("\\s"))
			.mapToInt(Integer::parseInt)
			.toArray();
		int s = 0;
		int cnt = 0;
		
		for (int i = 0; i < n; i++) {
			if(s%3 == arr[i]) {
				cnt++;
				s++;
			}
		}
		
		System.out.println(cnt);
	}

}