import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().split("\\s");
		StringBuilder sb = new StringBuilder();
		int len = sp.length;
		long sum = 0;
		
		for (int i = 0; i < len; i++) {
			sb.append(sp[i]);
			
			if( (i+1)%2 == 0 || i == len-1 ) {
				sum += Long.parseLong(sb.toString());
				sb.setLength(0);
			}
			
		}
		
		System.out.println(sum);
	}

}