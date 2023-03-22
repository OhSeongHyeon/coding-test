import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int inputArrLen = sc.nextInt();
			
			int[] outputArr = new int[inputArrLen];
			
			for (int i = 0; i < inputArrLen; i++) {
				int input1 = sc.nextInt();
				int input2 = sc.nextInt();
				
				outputArr[i] = input1 + input2;
			}
			
			for (int i = 0; i < outputArr.length; i++) {
				System.out.println(outputArr[i]);
			}
		}
	}
}