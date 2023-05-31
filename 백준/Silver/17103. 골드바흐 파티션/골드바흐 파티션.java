import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int tc = Integer.parseInt(br.readLine());
    	boolean[] isPrime = cip();
    	StringBuilder sb = new StringBuilder();
    	
    	for (int i = 0; i < tc; i++) {
    		int n = Integer.parseInt(br.readLine());
    		int cnt = 0;
    		
    		for (int j = 2; j <= n/2; j++) {
				if(isPrime[j] && isPrime[n-j]) {
					cnt++;
				}
			}
    		
    		sb.append(cnt).append("\n");
		}
    	
    	System.out.println(sb);
    }

	private static boolean[] cip() {
		int len = 1_000_000 + 1;
		double sqrt = Math.sqrt(len);
		boolean[] ip = new boolean[len];
		
		Arrays.fill(ip, true);
		ip[0] = ip[1] = false;
		
		for (int i = 2; i < sqrt; i++) {
			if(ip[i]) {
				for (int j = i+i; j < len; j+=i) {
					ip[j] = false;
				}
			}
		}
		
		return ip;
	}
    
}