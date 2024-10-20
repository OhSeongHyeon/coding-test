import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String decimal = br.readLine();
		System.out.println(toBinary(decimal));
	}
	
	public static String toBinary(String decimalStr) {
        StringBuilder binary = new StringBuilder();
        if (decimalStr.equals("0")) return "0";

        while (!decimalStr.equals("0")) {
            int remainder = divideByTwo(decimalStr);
            binary.append(remainder);
            decimalStr = divideAndGetQuotient(decimalStr);
        }

        return binary.reverse().toString();
    }
	
	public static int divideByTwo(String decimalStr) {
        int remainder = 0;
        int len = decimalStr.length();
		for (int i = 0; i < len; i++) {
            int currentDigit = Character.getNumericValue(decimalStr.charAt(i));
            remainder = (remainder * 10 + currentDigit) % 2;
        }
        return remainder;
    }
	
	public static String divideAndGetQuotient(String decimalStr) {
        StringBuilder quotient = new StringBuilder();
        int remainder = 0;
        int len = decimalStr.length();
        
		for (int i = 0; i < len; i++) {
            int currentDigit = Character.getNumericValue(decimalStr.charAt(i));
            int num = remainder * 10 + currentDigit;
            quotient.append(num / 2);
            remainder = num % 2;
        }

        while (quotient.length() > 1 && quotient.charAt(0) == '0') {
            quotient.deleteCharAt(0);
        }

        return quotient.toString();
    }
	
}