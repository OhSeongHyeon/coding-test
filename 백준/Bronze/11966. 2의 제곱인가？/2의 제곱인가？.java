import java.io.*;

public class Main {
	
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	double pow = 1;
    	
    	for (int i = 0; pow <= n && i <= 30; i++) {
    		pow = Math.pow(2, i);
			if(n == pow) {
				System.out.println(1);
				return;
			}
		}
		
		System.out.println(0);
    }

}