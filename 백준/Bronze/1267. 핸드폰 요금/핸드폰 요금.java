import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = Arrays.stream(br.readLine().split("\\s"))
				.mapToInt(Integer::parseInt)
				.toArray();
		int y = 0;
		int m = 0;
		
		for (int i = 0; i < n; i++) {
			y += 10 * (arr[i]/30 + 1);
			m += 15 * (arr[i]/60 + 1);
		}
		
		int min = Math.min(y, m);
		String yorm = y < m ? "Y %d" : "M %d";
		System.out.printf(y==m ? "Y M %d" : yorm, min);
	}
	
}