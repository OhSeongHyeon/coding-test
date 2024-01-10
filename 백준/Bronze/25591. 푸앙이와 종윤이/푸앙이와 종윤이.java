import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int a = 100 - n;
		int b = 100 - m;
		int c = 100 - (a + b);
		int d = a * b;
		int q = d/100;
		int r = d%100;
		System.out.printf("%d %d %d %d %d %d\n%d %d", a, b, c, d, q, r, q+c, r);
	}
	
}