import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int d = Integer.parseInt(br.readLine());
		int p = Integer.parseInt(br.readLine());
		int m = p <= c ? b : b + (p - c) * d;
		int min = Math.min(a*p, m);
		System.out.println(min);
	}

}