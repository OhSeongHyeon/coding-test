import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int len = input.length();
		long remainder = 0;
		long mod = 20000303;
		
		for (int i = 0; i < len; i++) {
			int nv = Character.getNumericValue(input.charAt(i));
			remainder = (remainder * 10 + nv) % mod;
		}
		
		System.out.println(remainder);
    }
	
}