import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while(t-- > 0) {
			String[] sp = br.readLine().split(" ");
			double d = Double.parseDouble(sp[0]);
			
			for (int i = 1; i < sp.length; i++) {
				if( "@".equals(sp[i]) ) {
					d *= 3;
				}else if("%".equals(sp[i])) {
					d += 5;
				}else if("#".equals(sp[i])) {
					d -= 7;
				}
			}
			
			sb.append(String.format("%.2f\n", d));
		}
		
		System.out.print(sb);
	}

}