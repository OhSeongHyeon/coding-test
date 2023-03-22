import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int inputNum = sc.nextInt();
			int output = 0;
			for (int i = 1; i <= inputNum; i++) {
				output += i;
			}
			System.out.println(output);
		}
	}
}