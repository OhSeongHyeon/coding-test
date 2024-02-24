import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int sum = 0;
		String in;
		
		while( (in = br.readLine()) != null && !in.isEmpty() ) {
			sum += Integer.parseInt(in);
		}
		
		System.out.println(t - sum);
	}

}