import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
    	try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
    		StringBuilder sb = new StringBuilder();
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int m = Integer.parseInt(st.nextToken());
        	int n = Integer.parseInt(st.nextToken());
        	int len = 1_000_001;
        	boolean[] isPrime = new boolean[len];
        	double sqrt = Math.sqrt(len);
        	
        	Arrays.fill(isPrime, true);
        	isPrime[0] = isPrime[1] = false;
        	
        	for (int i = 2; i < sqrt; i++) {
				if(isPrime[i]) {
					for (int j = i+i; j < len; j+=i) {
						isPrime[j] = false;
					}
				}
			}
        	
        	for (int i = m; i <= n; i++) {
				if(isPrime[i]) {
					sb.append(i).append("\n");
				}
			}
        	
        	bw.write(sb.toString());
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
    
}