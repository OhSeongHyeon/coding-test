import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while(t-- > 0) {
			int sum = Arrays.stream(br.readLine().split("\\s"))
				.mapToInt(Integer::parseInt)
				.sum();
			sb.append(sum).append("\n");
		}
		
		System.out.println(sb);
	}

}