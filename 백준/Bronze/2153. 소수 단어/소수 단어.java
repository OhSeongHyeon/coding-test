import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inp = br.readLine();
		int sum = 0;
		
		for(char c : inp.toCharArray()) {
			sum += Character.isLowerCase(c) ? c - 'a' + 1 : c - 'A' + 27;
		}
		
		System.out.printf("It is %sa prime word.", isPrime(sum) ? "" : "not ");
	}

	private static boolean isPrime(int n) {
		// 1도 문제 편의상 소수
        switch (n) {
    	case 0:
    		return false;
		case 1: case 2: case 3:
			return true;
		}

        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
	}
	
}