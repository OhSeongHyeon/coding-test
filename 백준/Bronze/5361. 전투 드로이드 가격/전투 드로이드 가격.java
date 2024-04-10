import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		double[] prices = {350.34, 230.90, 190.55, 125.30, 180.90};
		
		for (int i = 0; i < n; i++) {
			String[] sp = br.readLine().split("\\s");
			double purchase = 0.0;
			
			for (int j = 0; j < sp.length; j++) {
				purchase += prices[j] * Double.parseDouble(sp[j]);
			}
			
			sb.append(String.format("$%.2f\n", Math.round(purchase*100.0)/100.0));
		}
		
		System.out.println(sb);
	}

}