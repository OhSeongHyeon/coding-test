import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		final char[] yut = {'D', 'C', 'B', 'A', 'E'};
		int turn = 3;
		
		for (int i = 0; i < turn; i++) {
			String[] inpArr = br.readLine().split("\\s");
			int idx = Arrays.stream(inpArr)
				.mapToInt(Integer::parseInt)
				.sum();
			sb.append(yut[idx]).append("\n");
		}
		
		System.out.println(sb);
	}
	
}