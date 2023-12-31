import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine()) * 100;
		int d = Integer.parseInt(br.readLine());
		int res = m + d;
		int tg = 2*100 + 18;
		if(tg == res) {
			System.out.println("Special");
		}else if(tg > res) {
			System.out.println("Before");
		}else if(tg < res) {
			System.out.println("After");
		}
	}

}