import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
        boolean containsSeven = String.valueOf(n).contains("7");
        boolean divisibleBySeven = (n % 7 == 0);
        
        if (!containsSeven && !divisibleBySeven) {
            System.out.println(0);
        } else if (!containsSeven && divisibleBySeven) {
            System.out.println(1);
        } else if (containsSeven && !divisibleBySeven) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }
    }
	
}