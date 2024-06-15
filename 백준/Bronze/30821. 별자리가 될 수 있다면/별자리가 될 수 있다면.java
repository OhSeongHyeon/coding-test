import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long res = combination(n, 5);
		System.out.println(res);
	}

	// 조합 nCk
	private static long combination(int n, int k) {
		if (k > n - k) {
            k = n - k;
        }
		
        long c = 1;
        for (int i = 0; i < k; i++) {
            c = c * (n - i) / (i + 1);
        }
        
        return c;
	}
	
}