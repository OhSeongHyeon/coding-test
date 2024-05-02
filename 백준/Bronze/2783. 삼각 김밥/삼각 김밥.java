import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double thsd = 1_000.0;
		String[] sp = br.readLine().split("\\s");
		double x = Double.parseDouble(sp[0]);
		double y = Double.parseDouble(sp[1]);
		double min = x * (thsd/y);
		int n = Integer.parseInt(br.readLine());
		
		while(n-- > 0) {
			String[] spn = br.readLine().split("\\s");
			double xn = Double.parseDouble(spn[0]);
			double yn = Double.parseDouble(spn[1]);
			min = Math.min(min, xn * (thsd/yn));
		}
		
		System.out.printf("%.2f", min);
	}
	
}