import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int input = sc.nextInt();
			
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", input, i, input * i);
			}
		}
	}
}