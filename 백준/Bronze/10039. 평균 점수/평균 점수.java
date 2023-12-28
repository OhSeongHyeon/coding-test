import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sn = 5;
		int sum = 0;
		
		for (int i = 0; i < sn; i++) {
			int score = Integer.parseInt(br.readLine());
			sum += score > 40 ? score : 40;
		}
		
		System.out.println(sum/sn);
	}

}