import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inp = br.readLine();
		int len = inp.length();
		int mid = len / 2;
		int left = 0;
		int right = 0;
		
		for (int i = 0; i < mid; i++) {
			left += Character.getNumericValue(inp.charAt(i));
			right += Character.getNumericValue(inp.charAt(len-1-i));
		}
		
		System.out.println(left == right ? "LUCKY" : "READY");
	}
	
}