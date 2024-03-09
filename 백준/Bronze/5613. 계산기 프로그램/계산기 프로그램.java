import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in;
		int lineCnt = 0;
		char sign = '+';
		int res = 0;
		
		while( !(in = br.readLine()).equals("=") && lineCnt++ >= 0 ) {
			if(lineCnt%2 == 0) {
				sign = in.charAt(0);
				continue;
			}
			
			int n = Integer.parseInt(in);
			switch (sign) {
				case '+': res += n;
					break;
				case '-': res -= n;
					break;
				case '*': res *= n;
					break;
				case '/': res /= n;
					break;
			}
		}
		
		System.out.println(res);
	}

}