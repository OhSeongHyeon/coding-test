import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while(t-- > 0) {
			String[] sp = br.readLine().split(" ");
			int a = Integer.parseInt(sp[0]);
			int b = Integer.parseInt(sp[1]);
			int gcd = gcd(a, b);
			int lcm = a * b / gcd;
			sb.append(String.format("%d %d\n", lcm, gcd));
		}
		
		System.out.println(sb);
	}
	
	private static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		}
		return gcd(b, a%b);
	}

}