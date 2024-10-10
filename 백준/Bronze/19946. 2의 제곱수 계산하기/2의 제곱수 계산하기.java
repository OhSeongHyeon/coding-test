import java.io.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger binum = new BigInteger(br.readLine());
        int cnt = 64;

        while(binum.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
        	binum = binum.divide(BigInteger.TWO);
        	cnt--;
        }

        System.out.println(cnt);
    }
	
}
