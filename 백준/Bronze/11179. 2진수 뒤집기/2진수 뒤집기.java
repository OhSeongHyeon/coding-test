import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*
        String binStr = Integer.toBinaryString(Integer.parseInt(br.readLine()));
		char[] ca = binStr.toCharArray();
		int mid = ca.length / 2;
		
		for (int i = 0; i < mid; i++) {
			char tmp = ca[i];
			ca[i] = ca[ca.length-1-i];
			ca[ca.length-1-i] = tmp;
		}
		
		System.out.println(Integer.parseInt(String.valueOf(ca), 2));
		*/
		
		int n = Integer.parseInt(br.readLine());
        int res = 0;
        
        while (n > 0) {
            res = (res << 1) | (n & 1);
            n >>= 1;
        }
        
        System.out.println(res);
    }

}