import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().split(" ");
		int a = Integer.parseInt(sp[0]);
		int b = Integer.parseInt(sp[1]);
		int n = 1;
		int res = 0;
		
		for (int i = 1; i <= b; i++) {
			if(i >= a) {
				res += n;
			}
			if(i == n*(n+1)/2) {
				n++;
			}
		}
		
		System.out.println(res);
	}
	
}