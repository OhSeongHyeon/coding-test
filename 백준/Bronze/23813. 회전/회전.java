import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String rl = br.readLine();
		int n = Integer.parseInt(rl);
		int mul = (int) Math.pow(10, rl.length()-1);
		int rep = n/10 + n%10*mul;
		long sum = rep;
		
		while(n != rep) {
			rep = rep/10 + rep%10*mul;
			sum += rep;
		}
		
		System.out.println(sum);
	}
	
}