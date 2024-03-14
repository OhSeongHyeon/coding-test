import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for (int b = 1; b <= 500; b++) {
			int b2 = b * b;
			
			for (int a = 1; a <= 500; a++) {
				int a2 = a * a;
				int calc = a2 - b2;
				
				if(calc > n) {
					break;
				}else if(calc == n) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
	}

}