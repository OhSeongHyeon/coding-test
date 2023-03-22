import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int sum = sc.nextInt();
			int numOfType = sc.nextInt();
			
			int total = 0;
			
			boolean isCorrect = false;
			
			for (int i = 0; i < numOfType; i++) {
				int price = sc.nextInt();
				int num = sc.nextInt();
				
				total += price * num;
			}
			
			if( sum == total ) {
				isCorrect = true;
			}
			
			System.out.println(isCorrect ? "Yes" : "No");
		}
	}
}