import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String in;
		
		while( !(in = br.readLine()).equals("0 0") ) {
			String[] sp = in.split("\\s");
			int a = Integer.parseInt(sp[0]);
			int b = Integer.parseInt(sp[1]);
			int cnt = 0;
			int carry = 0;
			
			while(a > 0 || b > 0) {
				int s = a%10 + b%10 + carry;
				carry = s/10;
				cnt += carry;
				a /= 10;
				b /= 10;
			}
			
			sb.append(cnt).append("\n");
		}
		
		System.out.println(sb);
	}

}