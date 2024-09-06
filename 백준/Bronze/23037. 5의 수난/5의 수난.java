import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int res = br.readLine()
			.chars()
			.map(c -> (int) Math.pow(Character.getNumericValue(c), 5))
			.reduce(0, Integer::sum);
		System.out.println(res);
	}
	
}