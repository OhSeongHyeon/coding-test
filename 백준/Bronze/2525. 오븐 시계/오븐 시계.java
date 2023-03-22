import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int currentHour = sc.nextInt();
			int currentMin = sc.nextInt();
			int cookingTime = sc.nextInt();
			
			int outputHour = currentHour;
			int outputMin = currentMin + cookingTime;
			
			if( outputMin >= 60 ) {
				outputHour += outputMin / 60;
				outputHour %= 24;
				outputMin = outputMin % 60;
			}
			
			System.out.printf("%d %d", outputHour, outputMin);
		}
	}
}