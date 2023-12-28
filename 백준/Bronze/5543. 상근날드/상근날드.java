import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int hmin = Integer.MAX_VALUE;
		int smin = Integer.MAX_VALUE;
		
		for (int i = 0; i < 3; i++) {
			hmin = Math.min(hmin, Integer.parseInt(br.readLine()));
		}
		
		for (int i = 0; i < 2; i++) {
			smin = Math.min(smin, Integer.parseInt(br.readLine()));
		}
		
		System.out.println(hmin + smin - 50);
	}

}