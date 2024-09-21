import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in;
		StringBuilder sb = new StringBuilder();
		
		while( !(in = br.readLine()).equals("0") ) {
			int n = Integer.parseInt(in);
			while(n/10 > 0) {
				n = digitSum(n);
			}
			sb.append(n).append("\n");
		}
		
		System.out.println(sb);
	}

	private static int digitSum(int n) {
		int sum = 0;
		
		while(n > 0) {
			sum += n%10;
			n /= 10;
		}
		
		return sum;
	}
	
}