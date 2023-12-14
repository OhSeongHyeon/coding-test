import java.io.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger total = new BigInteger(br.readLine());
        BigInteger more = new BigInteger(br.readLine());
        BigInteger k = total.subtract(more).divide(BigInteger.valueOf(2)).add(more);
        BigInteger n = total.subtract(k);
        System.out.printf("%s\n%s", k.toString(), n.toString());
    }

}