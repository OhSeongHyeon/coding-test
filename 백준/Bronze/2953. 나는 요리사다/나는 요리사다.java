import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int participants = 5;
		int entryNumber = -1;
		int maxScore = Integer.MIN_VALUE;
		
		for (int i = 1; i <= participants; i++) {
			String input = br.readLine();
			int totalScore = Arrays.stream(input.split("\\s"))
				.mapToInt(Integer::parseInt)
				.sum();
			
			if(maxScore < totalScore) {
				entryNumber = i;
				maxScore = totalScore;
			}
		}
		
		System.out.printf("%d %d", entryNumber, maxScore);
	}

}