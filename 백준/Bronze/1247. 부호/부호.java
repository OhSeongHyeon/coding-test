import java.io.*;
import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = 3;
		
		for (int i = 0; i < tc; i++) {
			int len = Integer.parseInt(br.readLine());
			BigInteger s = BigInteger.ZERO;
			
			for (int j = 0; j < len; j++) {
				s = s.add(new BigInteger(br.readLine()));
			}
			
			switch (s.compareTo(BigInteger.ZERO)) {
				case 1: sb.append("+");
					break;
				case -1: sb.append("-");
					break;
				default: sb.append("0");
					break;
			}

			sb.append("\n");
		}
		
		System.out.println(sb);
	}

}