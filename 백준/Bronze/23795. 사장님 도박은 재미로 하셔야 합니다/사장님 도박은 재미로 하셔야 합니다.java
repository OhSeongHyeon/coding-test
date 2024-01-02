import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		String input;
		
		while( !(input = br.readLine()).equals("-1") ) {
			sum += Integer.parseInt(input);
		}
		
		System.out.println(sum);
	}

}