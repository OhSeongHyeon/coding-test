import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sp = br.readLine().split(" ");
        int len = Math.max(sp[0].length(), sp[1].length());
        int[] digits = new int[len];
        int num1 = Integer.parseInt(sp[0]);
        int num2 = Integer.parseInt(sp[1]);
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < len; i++) {
			digits[i] = num1%10 + num2%10;
			num1 /= 10;
			num2 /= 10;
		}
        
        for (int i = len - 1; i >= 0; i--) {
			sb.append(digits[i]);
		}
        
        System.out.println(sb);
    }
	
}