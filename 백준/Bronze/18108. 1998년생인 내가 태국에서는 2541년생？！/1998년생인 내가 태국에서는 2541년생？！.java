import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in);) {
			int y = sc.nextInt();
			System.out.println(y - 543);
		}
	}
}