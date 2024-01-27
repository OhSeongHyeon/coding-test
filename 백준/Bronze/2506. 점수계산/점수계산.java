import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sp = br.readLine().split("\\s");
		int cnt = 0;
		int totalScore = 0;
		
		for (int i = 0; i < n; i++) {
			int mark = Integer.parseInt(sp[i]);
			cnt += mark;
			if(mark == 0 || (i+1) == n) {
				totalScore += cnt * (cnt+1) / 2;
				cnt = 0;
			}
		}
		
		System.out.println(totalScore);
	}

}