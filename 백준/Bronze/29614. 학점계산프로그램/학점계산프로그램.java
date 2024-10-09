import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String rl = br.readLine();
        int len = rl.length();
        double sum = 0;
        
        for (char c : rl.toCharArray()) {
			switch (c) {
			case 'A': sum += 4.0;
				break;
			case 'B': sum += 3.0;
				break;
			case 'C': sum += 2.0;
				break;
			case 'D': sum += 1.0;
				break;
			case 'F':
				break;
			default: sum += 0.5;
				len--;
				break;
			}
		}
        
        System.out.println(sum/len);
    }
	
}