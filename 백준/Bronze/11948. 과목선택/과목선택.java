import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		int min0 = Integer.MAX_VALUE;
		int min1 = Integer.MAX_VALUE;
		
		for (int i = 0; i < 6; i++) {
			int score = Integer.parseInt(br.readLine());
			sum += score;
			if(i >= 0 && i <= 3) {
				min0 = Math.min(min0, score);
			}
			if(i >= 4 && i <= 5) {
				min1 = Math.min(min1, score);
			}
		}
		System.out.println(sum-min0-min1);
	}

}