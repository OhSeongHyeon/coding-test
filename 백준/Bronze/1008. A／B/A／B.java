import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in);) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			BigDecimal a_BD = new BigDecimal(a);
			BigDecimal b_BD = new BigDecimal(b);
			int scale = 50;
			
			BigDecimal res = a_BD.divide(b_BD, scale, RoundingMode.HALF_EVEN).stripTrailingZeros();
			
			System.out.println(res);
		}
	}
}