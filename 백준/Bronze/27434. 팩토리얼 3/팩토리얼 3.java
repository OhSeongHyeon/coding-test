import java.io.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		BigInteger res = factorial(1, n);
        System.out.println(res);
    }
	
	private static BigInteger factorial(int i, int n) {
		BigInteger ret = BigInteger.valueOf(i);
        if(i < n){
            int b = (i+n)/2;
            ret = factorial(i, b).multiply(factorial(b+1, n));
        }
        return ret;
    }

}