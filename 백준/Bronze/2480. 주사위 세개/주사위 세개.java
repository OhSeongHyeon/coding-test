import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int dice1 = sc.nextInt();
			int dice2 = sc.nextInt();
			int dice3 = sc.nextInt();
			int[] diceResult = {dice1, dice2, dice3};
			
			// 전부 같을때
			if( (dice1 == dice2) && (dice2 == dice3) && (dice1 == dice3) ) {
				System.out.printf("%d", 10000 + dice1 * 1000);
				return;
			}
			
			// 일부만 같거나 전부 다를때
			for (int i = 0; i < diceResult.length; i++) {
				for (int j = i+1; j < diceResult.length; j++) {
					if( diceResult[i] == diceResult[j] ) {
						System.out.printf("%d", 1000 + diceResult[i] * 100);
						return;
					}else if( diceResult[i] <= diceResult[j] ) {
						int temp = diceResult[i];
						diceResult[i] = diceResult[j];
						diceResult[j] = temp;
					}
				}
			}
			System.out.printf("%d", diceResult[0] * 100);
		}
	}
}