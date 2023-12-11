import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int numerator = b - a;
		int gcd = getGCD(numerator, b);
		System.out.printf("%d %d", numerator/gcd, b/gcd);
    }

	private static int getGCD(int a, int b) {
		int r = a%b;
		if(r == 0) return b;
		return getGCD(b, r);
	}

}