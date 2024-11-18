import java.io.*;
import java.math.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sp = br.readLine().split(" ");
        BigDecimal a = new BigDecimal(sp[0]);
        BigDecimal b = new BigDecimal(sp[1]);
        String res = a.divide(b, 1100, RoundingMode.HALF_UP)
    		.stripTrailingZeros()
    		.toPlainString();
        System.out.println(res);
    }

}