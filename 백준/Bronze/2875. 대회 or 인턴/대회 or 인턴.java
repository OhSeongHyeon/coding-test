import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().split("\\s");
		int n = Integer.parseInt(sp[0]);
		int m = Integer.parseInt(sp[1]);
		int k = Integer.parseInt(sp[2]);
		int t = n/2 <= m ? n/2 : m;
		int r = (m-t) + (n-t*2);
		k = k-r < 0 ? 0 : k-r;
		System.out.println(k <= 0 ? t : t - k/3 - (k%3==0 ? 0 : 1));
	}

}