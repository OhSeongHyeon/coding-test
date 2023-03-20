import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int jjumsu = sc.nextInt();
	        if(100 >= jjumsu && jjumsu >= 90) {
	        	System.out.println("A");
	        }else if(90 > jjumsu && jjumsu >= 80) {
	        	System.out.println("B");
	        }else if(80 > jjumsu && jjumsu >= 70) {
	        	System.out.println("C");
	        }else if(70 > jjumsu && jjumsu >= 60) {
	        	System.out.println("D");
	        }else {
	        	System.out.println("F");
	        }
		}
	}
}
