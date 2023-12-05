import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input;
		
		while((input = br.readLine()) != null && !input.equals("0")) {
			int n = Integer.parseInt(input);
			int sum = 0;
			
			for (int i = 1; i <= n; i++) {
				sum += i;
			}
			
			sb.append(sum).append("\n");
		}
		
		System.out.println(sb);
    }
	
}