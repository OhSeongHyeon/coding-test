import java.util.*;
import java.io.*;

public class Main {
	
	private static final Map<Integer, Integer> MEMO = new HashMap<>();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(fibonacci(n));
	}
	
	private static int fibonacci(int n) {
		if(n == 1) {
			return 1;
		}else if(n < 1) {
			return 0;
		}
		
		if(MEMO.containsKey(n)) {
			return MEMO.get(n);
		}
		
		int f = fibonacci(n-1) + fibonacci(n-2);
		MEMO.put(n, f);
		return f;
	}

}