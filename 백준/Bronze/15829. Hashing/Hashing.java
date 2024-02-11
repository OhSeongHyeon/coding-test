import java.io.*;

public class Main {
	
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int l = Integer.parseInt(br.readLine());
    	String input = br.readLine();
    	int r = 31;
    	int m = 1234567891;
    	long res = 0;
    	
    	for (int i = 0; i < l; i++) {
			int a = input.charAt(i) - 'a' + 1;
			for (int j = 0; j < i; j++) {
				a *= r;
				if(a > m) {
					a %= m;
				}
			}
			res += a;
		}
    	
    	System.out.println(res);
    }

}