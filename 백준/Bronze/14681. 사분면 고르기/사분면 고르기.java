import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int x = sc.nextInt()
			, y = sc.nextInt()
			, quadrant = 0;
			
			if( x > 0 && y > 0 ) {
				quadrant = 1;
			}else if( x < 0 && y > 0 ) {
				quadrant = 2;
			}else if( x < 0 && y < 0 ) {
				quadrant = 3;
			}else if( x > 0 && y < 0 ) {
				quadrant = 4;
			}
			System.out.println(quadrant);
		}
	}
}