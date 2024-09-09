import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().split(" ");
		int e = Integer.parseInt(sp[0]);
		int f = Integer.parseInt(sp[1]);
		int b = e + f;
		int c = Integer.parseInt(sp[2]);
		int res = 0;
		
		while(b >= c) {
			res += b / c;
			b = b%c == 0 ? b / c : b / c + b%c;
		}
		
		System.out.println(res);
	}
	
}