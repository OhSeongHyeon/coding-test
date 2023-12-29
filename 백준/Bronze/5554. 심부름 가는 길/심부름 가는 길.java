import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int sum = 0;
		
		for (int i = 0; i < 4; i++) {
			sum += Integer.parseInt(br.readLine());
		}
		
		System.out.println(sb.append(sum/60).append("\n").append(sum%60));
	}

}