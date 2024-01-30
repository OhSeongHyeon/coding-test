import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int totalClap = 0;
		
		for (int i = 1; i <= n; i++) {
			int a = i;
			while( a > 0 ) {
				switch(a%10) {
					case 3: case 6: case 9: totalClap++;
				}
				a = a/10;
			}
		}
		
		System.out.println(totalClap);
	}

}