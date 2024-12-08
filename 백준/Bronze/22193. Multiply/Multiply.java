import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        String a = br.readLine();
        String b = br.readLine();

        java.math.BigInteger num1 = new java.math.BigInteger(a);
        java.math.BigInteger num2 = new java.math.BigInteger(b);
        java.math.BigInteger result = num1.multiply(num2);

        System.out.println(result.toString());
	}

}