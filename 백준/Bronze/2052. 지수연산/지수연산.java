import java.io.*;
import java.math.*;

public class Main {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double res = Math.pow(0.5, n);
        BigDecimal bd = new BigDecimal(res).setScale(n, RoundingMode.HALF_UP);
        System.out.println(bd.toPlainString());
    }

}