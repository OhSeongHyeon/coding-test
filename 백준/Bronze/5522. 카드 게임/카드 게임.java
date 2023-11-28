import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		int sum = 0;
		
		while((input = br.readLine()) != null && !input.isEmpty()) {
			sum += Integer.parseInt(input);
		}
		
		System.out.println(sum);
    }
}