import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int multipleOfFour = sc.nextInt();
			int len = multipleOfFour / 4;
			
			StringBuilder strbd = new StringBuilder();
			
			for (int i = 0; i < len; i++) {
				strbd.append("long ");
			}
			strbd.append("int");
			System.out.println(strbd.toString());
		}
	}
}