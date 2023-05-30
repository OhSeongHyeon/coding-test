import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	boolean[] isPrime = cp();
    	int n;
    	
    	while ( (n = Integer.parseInt(br.readLine())) != 0 ) {
    		int cnt = 0;
    		
    		for (int i = n+1; i <= n*2; i++) {
				if(isPrime[i]) {
					cnt++;
				}
			}
    		
    		System.out.println(cnt);
    	}
    }

	private static boolean[] cp() {
		int len = (123456*2) + 1;
		double sqrt = Math.sqrt(len);
		boolean[] ip = new boolean[len];
		
		Arrays.fill(ip, true);
		ip[0] = ip[1] = false;
		
		for (int i = 2; i < sqrt; i++) {
			if(ip[i]) {
				for (int j = i+i; j < len; j += i) {
					ip[j] = false;
				}
			}
		}
		
		return ip;
	}
    
}