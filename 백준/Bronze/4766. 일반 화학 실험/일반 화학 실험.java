import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double t = Double.parseDouble(br.readLine());
		StringBuilder sb = new StringBuilder();
		String s;
		
		while( !(s = br.readLine()).equals("999") ) {
			double it = Double.parseDouble(s);
			sb.append(String.format("%.2f\n", it - t));
			t = it;
		}
		
		System.out.println(sb);
	}

}