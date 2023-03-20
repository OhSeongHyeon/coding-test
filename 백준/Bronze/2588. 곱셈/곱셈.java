import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in);) {
			int A = sc.nextInt();
			String B = sc.next();

			char[] charArray = B.toCharArray();
			
			for (int i = charArray.length-1; i >= 0; i--) {
				int num = Character.getNumericValue(charArray[i]);
				System.out.println(A*num);
			}
			
			System.out.println(A*Integer.parseInt(B));
		}
	}
}