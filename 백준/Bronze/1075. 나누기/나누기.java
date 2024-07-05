import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int f = Integer.parseInt(br.readLine());
		int sn = n/100*100;
		System.out.printf("%02d", (f - sn%f)%f);
	}
	
}