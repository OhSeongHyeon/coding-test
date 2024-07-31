import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		/*
			1. 테두리: 5 + 5*(n-1)
			-가운데-
			2. 1시 방향으로, 2 + 3 + ... 누적합: n*(n+1)/2 - 1
			3. 사이드로 퍼지는, 0 + 2 + 4 + ... 짝수 누적합: (n-2)*(n-1)
		 */
		long edge = 5 + 5*(n-1);
		long center = n*(n+1)/2 - 1;
		long radial = (n-2)*(n-1);
		System.out.println(n == 1 ? 5 : (edge + center + radial)%45678);
	}

}