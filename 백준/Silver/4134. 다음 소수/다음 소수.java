import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
    	try(
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
    		int tc = Integer.parseInt(br.readLine());
    		StringBuilder sb = new StringBuilder();
    		
    		for (int i = 0; i < tc; i++) {
				String str_n = br.readLine();
				BigInteger npn = new BigInteger(str_n);
				
				if(npn.isProbablePrime(10)) {
					sb.append(npn);
				}else {
					sb.append(npn.nextProbablePrime());
				}
				sb.append("\n");
			}
    		
    		bw.write(sb.toString());
    		bw.flush();
    	}
    }
    
}