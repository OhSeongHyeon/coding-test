import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	// 백준 11653번
    public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	int n = Integer.parseInt(br.readLine());
        	
        	if(n == 1) return;
        	
        	StringBuilder sb = new StringBuilder();
        	
        	int nLen = 10_000_000;
        	boolean[] isPn = createSieveOfEratosthenes(nLen);
        	
        	for (int i = 2; i < isPn.length; i++) {
        		if(isPn[i]) {
        			while(n%i == 0) {
        				sb.append(i).append("\n");
        				n /= i;
        			}
        		}
			}
        	
        	bw.write(sb.toString());
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
    
    // numLength = 10_000_000 
    private static boolean[] createSieveOfEratosthenes(int numLength) {
    	boolean[] isPrimeNumbers = new boolean[numLength + 1];
    	Arrays.fill(isPrimeNumbers, true);
    	isPrimeNumbers[0] = isPrimeNumbers[1] = false;
    	
        for (int i = 2; i*i <= numLength; i++) {
            if (isPrimeNumbers[i]) {
                for (int j = i*i; j <= numLength; j += i) {
                	isPrimeNumbers[j] = false;
                }
            }
        }
    	
    	return isPrimeNumbers;
    }
    
}